package grafikeditor.graphiti.features.layout;

import style.Appearance;


import grafikeditor.graphiti.*;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.ui.services.GraphitiUi;
public class MeinEditorLayoutUtils {

	public static final String KEY_HORIZONTAL = "horizontal";
	public static final String KEY_VERTICAL = "vertical";
	
	public static final String KEY_HORIZONTAL_UNDEFINED = "undef";
	public static final String KEY_HORIZONTAL_LEFT = "h_layout_left";
	public static final String KEY_HORIZONTAL_CENTER = "h_layout_center";
	public static final String KEY_HORIZONTAL_RIGHT = "h_layout_right";
	
	public static final String KEY_VERTICAL_UNDEFINED = "undef";
	public static final String KEY_VERTICAL_TOP = "v_layout_top";
	public static final String KEY_VERTICAL_MIDDLE = "v_layout_middle";
	public static final String KEY_VERTICAL_BOTTOM = "v_layout_bottom";

	public static final String KEY_MARGIN_HORIZONTAL = "margin_horizontal";
	public static final String KEY_MARGIN_VERTICAL = "margin_vertical";
	
	public static final String KEY_INITIAL_POINTS = "initial_points";
	public static final String KEY_INITIAL_PARENT_SIZE = "initial_parent_size";

	public static final String KEY_GA_NAME = "ga_name";

	private static IGaService gaService = Graphiti.getGaService();

	public static void layout(final GraphicsAlgorithm parent, final GraphicsAlgorithm ga) {
		/*TransactionalEditingDomain dom = TransactionUtil.getEditingDomain(ga);
		if (dom == null)
			dom = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		dom.getCommandStack().execute(new RecordingCommand(dom) {
			
			@Override
			protected void doExecute() {*/

				IPeService peService = Graphiti.getPeService();
				IGaService gaService = Graphiti.getGaService();
				String horizontal = peService.getPropertyValue(ga, KEY_HORIZONTAL);
				String vertical = peService.getPropertyValue(ga, KEY_VERTICAL);
				int xMargin = 0;
				int yMargin = 0;
				if (peService.getPropertyValue(ga, KEY_MARGIN_HORIZONTAL) != null)
					xMargin = Integer.parseInt(peService.getPropertyValue(ga, KEY_MARGIN_HORIZONTAL));
				if (peService.getPropertyValue(ga, KEY_MARGIN_VERTICAL) != null)
					yMargin = Integer.parseInt(peService.getPropertyValue(ga, KEY_MARGIN_VERTICAL));
			
				if (parent == null || ga == null)
					return;
				
				int parentWidth = parent.getWidth(), parentHeight = parent.getHeight();
				int gaWidth = ga.getWidth(), gaHeight = ga.getHeight();
				if (ga instanceof Text) {
					IDimension dim = getTextDimension((Text) ga);
					gaService.setWidth(ga, dim.getWidth());
					gaService.setHeight(ga, dim.getHeight());
					gaWidth = dim.getWidth();
					gaHeight = dim.getHeight();
				}

				if (ga instanceof MultiText) {
					MultiText mt = (MultiText) ga;
					String content = mt.getValue().trim();
					String[] lines = content.split("\n");
					int linesCount = lines.length + 1;
					int maxLineWidth = -1;
					int lineHeight = -1;
				
					IDimension dim = null;
					for (String s : lines) {
						dim = getTextDimension(s, (mt.getFont() != null) ? mt.getFont() : mt.getStyle().getFont());
						maxLineWidth = Math.max(maxLineWidth, dim.getWidth());
					}
					if (dim != null)
						lineHeight = dim.getHeight();
			
					gaWidth = maxLineWidth + 5;
					gaHeight = lineHeight * linesCount;
					mt.setWidth(gaWidth);
					mt.setHeight(gaHeight);
			
					if (parent.getWidth() < gaWidth + mt.getX())
						parent.setWidth(gaWidth + mt.getX());
					if (parent.getHeight() < gaHeight + mt.getY())
						parent.setHeight(gaHeight + mt.getY());
			
					parentWidth = parent.getWidth();
					parentHeight = parent.getHeight();
				}
		
				if (KEY_HORIZONTAL_UNDEFINED.equals(horizontal) || KEY_VERTICAL_UNDEFINED.equals(vertical))
					return;
		
				int x = 0, y = 0;
		
				switch (horizontal) {
				case KEY_HORIZONTAL_LEFT:
					x = 0;
					break;
				case KEY_HORIZONTAL_CENTER:
					x = parentWidth / 2 - gaWidth / 2;
					break;
				case KEY_HORIZONTAL_RIGHT:
					x = parentWidth - gaWidth;
					break;
				default:
					break;
				}
			
				switch (vertical) {
				case KEY_VERTICAL_TOP:
					y = 0;
					break;
				case KEY_VERTICAL_MIDDLE:
					y = parentHeight / 2 - gaHeight / 2;
					break;
				case KEY_VERTICAL_BOTTOM:
					y = parentHeight - gaHeight;
					break;
				default:
					break;
				}
		
				gaService.setLocation(ga, x+xMargin, y+yMargin);
		/*	}
		});*/
	}

	public static IDimension getTextDimension(AbstractText t) {
		String value = t.getValue();
		Font font = (t.getFont() != null) ? t.getFont() : t.getStyle().getFont();
		IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(value, font);
		return dim;
	}

	private static IDimension getTextDimension(String value, Font font) {
		IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(value, font);
		return dim;
	}

	public static void setdefaultStyle(GraphicsAlgorithm ga, Diagram diagram) {
		if (ga instanceof AbstractText) {
			((AbstractText) ga).setRotation(0.0);
			((AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
		};
		ga.setBackground(gaService.manageColor(diagram, 229, 229, 229));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(LineStyle.SOLID);
		ga.setLineWidth(2);
		ga.setLineVisible(!false);
		
	}
	public static void set_MeinEditorDefaultAppearanceStyle(GraphicsAlgorithm ga, Diagram diagram) {
		if (ga instanceof AbstractText) {
			((AbstractText) ga).setRotation(0.0);
			((AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
		};
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(LineStyle.SOLID);
		ga.setLineWidth(1);
		ga.setLineVisible(!false);
		
	}
	public static void set_Appearance0Style(GraphicsAlgorithm ga, Diagram diagram) {
		if (ga instanceof AbstractText) {
			((AbstractText) ga).setRotation(0.0);
			((AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
		};
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(LineStyle.SOLID);
		ga.setLineWidth(2);
		ga.setLineVisible(!false);
		
	}
	public static void set_Appearance1Style(GraphicsAlgorithm ga, Diagram diagram) {
		if (ga instanceof AbstractText) {
			((AbstractText) ga).setRotation(0.0);
			((AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
		};
		ga.setBackground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(LineStyle.SOLID);
		ga.setLineWidth(2);
		ga.setLineVisible(!false);
		
	}
	public static void set_Appearance2Style(GraphicsAlgorithm ga, Diagram diagram) {
		if (ga instanceof AbstractText) {
			((AbstractText) ga).setRotation(0.0);
			((AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
		};
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(LineStyle.SOLID);
		ga.setLineWidth(2);
		ga.setLineVisible(!false);
		
	}


	public static void updateStyleFromAppearance(GraphicsAlgorithm ga, Appearance appearance, Diagram diagram) {
		if (appearance != null) {
			if (appearance.getImagePath() != null && ga instanceof Image) {
				String imageId = MeinEditorGraphitiUtils.getInstance().getImageId(appearance.getImagePath());
				((Image) ga).setId(imageId);
			}			

			if (appearance.getAngle() != -1 && ga instanceof AbstractText) {
				((AbstractText)ga).setRotation((double) appearance.getAngle());
			}
			
			if (appearance.getBackground() != null) {
				ga.setBackground(gaService.manageColor(diagram, appearance.getBackground().getR(),
					appearance.getBackground().getG(), 
					appearance.getBackground().getB()));
			}
			
			if (appearance.getForeground() != null) {
				ga.setForeground(gaService.manageColor(diagram, appearance.getForeground().getR(),
					appearance.getForeground().getG(), 
					appearance.getForeground().getB()));
			}
			
			if (appearance.getFont() != null && ga instanceof AbstractText) {
				((AbstractText)ga).setFont(gaService.manageFont(diagram, 
					appearance.getFont().getFontName(), 
					appearance.getFont().getSize(),
					appearance.getFont().isIsItalic(), 
					appearance.getFont().isIsBold()));
			}
			
			if (appearance.getTransparency() != -1) {
				ga.setTransparency(appearance.getTransparency());
			}
			
			if (!appearance.getLineStyle().equals(style.LineStyle.UNSPECIFIED))
				ga.setLineStyle(LineStyle.getByName(appearance.getLineStyle().getName()));
			
			if (appearance.getLineWidth() != -1)
				ga.setLineWidth(appearance.getLineWidth());
			
			ga.setLineVisible(!appearance.getLineInVisible());
			
		}
	}

	public static void createCIRCLE(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		IPeService peService = Graphiti.getPeService();
		Ellipse tmp = gaService.createEllipse(gaContainer);
		gaService.setSize(tmp, 12, 12);
		gaService.setLocation(tmp, tmp.getX() + 2, tmp.getY());
		tmp.setFilled(true);
	}

	public static  void createTRIANGLE(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		IPeService peService = Graphiti.getPeService();
		Polygon tmp = gaService.createPolygon(gaContainer, new int[] {-11,-8, 0,0, -11,8, -11,-8});
		gaService.setLocation(tmp, tmp.getX() + 2, tmp.getY());
		tmp.setFilled(true);
	}

	public static  void createARROW(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		IPeService peService = Graphiti.getPeService();
		Polyline tmp = gaService.createPolyline(gaContainer, new int[] {-10,-4, 0,0, -10,4});
		gaService.setLocation(tmp, tmp.getX() + 2, tmp.getY());
	}

	public static  void createDIAMOND(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		IPeService peService = Graphiti.getPeService();
		Polygon tmp = gaService.createPolygon(gaContainer, new int[] {-9,-6, 0,0, -9,6, -18,0, -9,-6});
		gaService.setLocation(tmp, tmp.getX() + 2, tmp.getY());
		tmp.setFilled(true);
	}
	
}

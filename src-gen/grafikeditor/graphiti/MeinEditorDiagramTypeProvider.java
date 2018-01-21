package grafikeditor.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import grafikeditor.graphiti.property.view.MeinEditorView;


public class MeinEditorDiagramTypeProvider extends AbstractDiagramTypeProvider {
	
	private IToolBehaviorProvider[] tbProviders;

	public MeinEditorDiagramTypeProvider() {
		super();
		setFeatureProvider(new MeinEditorFeatureProvider(this));
		MeinEditorGraphitiUtils.getInstance().loadImages();
		MeinEditorGraphitiUtils.getInstance().setDTP(this);
		MeinEditorView.initEStructuralFeatureInformation();
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (tbProviders == null) {
			tbProviders = new IToolBehaviorProvider[] {new MeinEditorToolBehaviourProvider(this)};
		}
		return tbProviders;
	}
}
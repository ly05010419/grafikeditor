package generation

import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import grafikeditor.meineditor.MeinEditor;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.ResourcesPlugin;
import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import graphmodel.Edge
import grafikeditor.meineditor.Terminal
import grafikeditor.meineditor.Gateway
import graphmodel.Node
import grafikeditor.meineditor.Start
import grafikeditor.meineditor.Variable
import java.util.ArrayList

class Generator implements IGenerator<MeinEditor> {
	override generate(MeinEditor model, IPath targetDir, IProgressMonitor monitor) {
		if(model.modelName.nullOrEmpty) throw new RuntimeException("Model's name must be set.")

		val codeMain = generateMain(model);
		val targetFileMain = ResourcesPlugin.workspace.root.getFileForLocation(targetDir.append("MeinGrammar.jj"))
		EclipseFileUtils.writeToFile(targetFileMain, codeMain)
	}

	private def generateMain(MeinEditor model) '''    
	
options
{
  static = true;
  DEBUG_PARSER= true;
  LOOKAHEAD = 2;
  FORCE_LA_CHECK = true;
}

PARSER_BEGIN(SyntaxParser)
import java.io.FileReader;
public class SyntaxParser
{
  public static void main(String args []) throws Exception
  {
    FileReader reader = new FileReader("./assets/test.txt");
    SyntaxParser parser = new SyntaxParser(reader);
    parser.parser();
    System.out.println("Syntax ist OK!  ");
  }
}

PARSER_END(SyntaxParser)

SKIP :
{
  " "
| "\r"
| "\t"
| "\n"
}

        «FOR Start : model.starts»
		void «Start.name»() :	
		{}
		{
			«createStartMethode(Start)»
		}
		«ENDFOR»


        «FOR Gateway : model.gateways»
        «IF existiertGateway(Gateway)»
		void «Gateway.id»() :	
		{}
		{
			«createGatewayMethode(Gateway)»
		}
		«ENDIF»
		«ENDFOR»


void parser() :
{}
{
  («model.starts.get(0).name»() ";")+<EOF>
}


	   '''

	def String createStartMethode(Start start) {

		var res = "";

		for (Node n : start.getSuccessors()) {
			if (n instanceof Terminal) {
			} else if (n instanceof Gateway) {
				res += "" + n.id + "()";
			}
		}

		return res;

	}

	def String createGatewayMethode(Gateway gateway) {
		var res = "";
		var count = 0;
		System.out.println(gateway.getOutgoing());
		for (Edge e : gateway.getOutgoing()) {

			var targetElement = e.targetElement;

			if (targetElement instanceof Terminal || targetElement instanceof Variable) {

				var terminalList = new java.util.ArrayList<Node>()
				suchenTerminal(e, terminalList);

				if (count > 0) {
					res += "|";
				}

				var g = suchenGateway(e);

				if (g != null && existiertGateway(g)) {

					res += createText(terminalList);

					res += "[" + g.id + "()]"

				} else {

					res += createText(terminalList);

				}

				count++;

			}
		}
		return res;
	}

	def boolean existiertGateway(Gateway gateway) {

		var terminalList = new java.util.ArrayList<Node>()

		for (Edge edge : gateway.getOutgoing()) {
			suchenTerminal(edge, terminalList);
		}

		if (terminalList.size() > 0) {
			return true;
		} else {
			return false;
		}

	}

	def Gateway suchenGateway(Edge edge) {

		var targetElement = edge.targetElement;

		if (targetElement instanceof Gateway) {
			return targetElement;
		} else if (targetElement instanceof Terminal) {
			return suchenGateway(targetElement.outgoing.get(0));
		}

	}

	def void suchenTerminal(Edge edge, ArrayList<Node> list) {

		System.out.println(edge);

		var targetElement = edge.targetElement;

		if (targetElement instanceof Terminal) {
			list.add(targetElement);
			suchenTerminal(targetElement.outgoing.get(0), list);
		} else if (targetElement instanceof Variable) {
			list.add(targetElement);
			suchenTerminal(targetElement.outgoing.get(0), list);
		}
	}

	def String createText(ArrayList<Node> list) {

		System.out.println(list);

		var res = "";

		for (Node t : list) {
			if (t instanceof Terminal) {
				res += "\"" + t.name + "\"";
			} else if (t instanceof Variable) {
				res += "" + t.name + "()";
			}

		}

		return res;

	}

	def String getNode(Node node) {

		var res = "";
		var count = 0;
		for (Node n : node.getSuccessors()) {
			if (n instanceof Terminal) {
				res += "\"" + n.name + "\"";
				res += getNode(n);
			} else if (n instanceof Variable) {
				res += "" + n.name + "()";
				res += getNode(n);
			} else if (n instanceof Gateway) {
				res += "" + n.name + "()";
			}

			count++;
		}

		return res;

	}

}

package generation


import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import grafikeditor.meineditor.MeinEditor;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.ResourcesPlugin;
import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import org.eclipse.emf.common.util.EList
import graphmodel.Edge

class Generator1 implements IGenerator<MeinEditor> {
	override generate(MeinEditor model, IPath targetDir, IProgressMonitor monitor) {
		if(model.modelName.nullOrEmpty) throw new RuntimeException("Model's name must be set.")
		
		val codeMain = generateMain(model);
		val targetFileMain = ResourcesPlugin.workspace.root.getFileForLocation(targetDir.append("MeinGrammar.jj"))
		EclipseFileUtils.writeToFile(targetFileMain, codeMain)
	}
private def generateMain(MeinEditor model) '''    
	
PARSER_BEGIN(DiagrammParser)
		
		public class DiagrammParser
		{
		
		  public static void main(String args []) throws ParseException
		  {
		  	DiagrammParser parser = new DiagrammParser(System.in);
		  	try {
				System.out.println("Bitte «model.modelName» eingeben.");
				parser.«model.modelName»();
				System.out.println("«model.modelName» ok");
				} catch (ParseException e) {
					System.err.println(e);
				} catch (Exception e) {
				System.err.println(e);
			}
		}

		PARSER_END(DiagrammParser)
		
		SKIP :
		{
		  " "
		| "\r"
		| "\t"
		| "\n"
		}
		void «model.modelName»() :
		{}
		{
			start«model.starts.get(0).id»()
		}
		
		void start«model.starts.get(0).id»() :	// get first startnode assuming there is only one
		{}
		{
			«verodern(model.starts.get(0).outgoing)»
		}
		
		«FOR Terminal : model.terminals»
		void terminal«Terminal.id»() :	
		{}
		{
			"«Terminal.name»" «verodern(Terminal.outgoing)»
		}
		«ENDFOR»
		
		«FOR Variable : model.variables»
		void variable«Variable.id»() :	
		{}
		{
			"VariablePlaceholder"
			«verodern(Variable.outgoing)»
		}
		«ENDFOR»
		
		«FOR Verzweigung : model.gateways»
		void gateway«Verzweigung.id»() :	
		{}
		{
			«verodern(Verzweigung.outgoing)»
		}
		«ENDFOR»
		
		«FOR Ende : model.ends»
		void end«Ende.id»() :	
		{}
		{}
		«ENDFOR»
		
	'''
	
	def String verodern(EList<Edge> transitions) {
		var res = "";
		var i = 0;
		if (transitions.size > 0) {
			res += transitions.get(i).targetElement.eClass.name.toFirstLower + transitions.get(i).targetElement.id +"()"
			i++
			while (transitions.size > i) {
				res += " | " + transitions.get(i).targetElement.eClass.name.toFirstLower + transitions.get(i).targetElement.id +"()"
				i++
			} 
		}
		
		return res;
	}

	
}
package generation;

import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Variable;
import graphmodel.Edge;
import graphmodel.Node;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Generator1 implements IGenerator<MeinEditor> {
  public void generate(final MeinEditor model, final IPath targetDir, final IProgressMonitor monitor) {
    String _modelName = model.getModelName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_modelName);
    if (_isNullOrEmpty) {
      throw new RuntimeException("Model\'s name must be set.");
    }
    final CharSequence codeMain = this.generateMain(model);
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    IPath _append = targetDir.append("MeinGrammar.jj");
    final IFile targetFileMain = _root.getFileForLocation(_append);
    EclipseFileUtils.writeToFile(targetFileMain, codeMain);
  }
  
  private CharSequence generateMain(final MeinEditor model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("PARSER_BEGIN(DiagrammParser)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class DiagrammParser");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("public static void main(String args []) throws ParseException");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.append("DiagrammParser parser = new DiagrammParser(System.in);");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(\"Bitte ");
    String _modelName = model.getModelName();
    _builder.append(_modelName, "\t\t\t\t");
    _builder.append(" eingeben.\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("parser.");
    String _modelName_1 = model.getModelName();
    _builder.append(_modelName_1, "\t\t\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(\"");
    String _modelName_2 = model.getModelName();
    _builder.append(_modelName_2, "\t\t\t\t");
    _builder.append(" ok\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("} catch (ParseException e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.err.println(e);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.err.println(e);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PARSER_END(DiagrammParser)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SKIP :");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("\" \"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| \"\\r\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| \"\\t\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| \"\\n\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void ");
    String _modelName_3 = model.getModelName();
    _builder.append(_modelName_3, "\t\t");
    _builder.append("() :");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("start");
    EList<Start> _starts = model.getStarts();
    Start _get = _starts.get(0);
    String _id = _get.getId();
    _builder.append(_id, "\t\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void start");
    EList<Start> _starts_1 = model.getStarts();
    Start _get_1 = _starts_1.get(0);
    String _id_1 = _get_1.getId();
    _builder.append(_id_1, "\t\t");
    _builder.append("() :\t// get first startnode assuming there is only one");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    EList<Start> _starts_2 = model.getStarts();
    Start _get_2 = _starts_2.get(0);
    EList<Edge> _outgoing = _get_2.getOutgoing();
    String _verodern = this.verodern(_outgoing);
    _builder.append(_verodern, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Terminal> _terminals = model.getTerminals();
      for(final Terminal Terminal : _terminals) {
        _builder.append("\t\t");
        _builder.append("void terminal");
        String _id_2 = Terminal.getId();
        _builder.append(_id_2, "\t\t");
        _builder.append("() :\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("\"");
        String _name = Terminal.getName();
        _builder.append(_name, "\t\t\t");
        _builder.append("\" ");
        EList<Edge> _outgoing_1 = Terminal.getOutgoing();
        String _verodern_1 = this.verodern(_outgoing_1);
        _builder.append(_verodern_1, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Variable> _variables = model.getVariables();
      for(final Variable Variable : _variables) {
        _builder.append("\t\t");
        _builder.append("void variable");
        String _id_3 = Variable.getId();
        _builder.append(_id_3, "\t\t");
        _builder.append("() :\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("\"VariablePlaceholder\"");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        EList<Edge> _outgoing_2 = Variable.getOutgoing();
        String _verodern_2 = this.verodern(_outgoing_2);
        _builder.append(_verodern_2, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Gateway> _gateways = model.getGateways();
      for(final Gateway Verzweigung : _gateways) {
        _builder.append("\t\t");
        _builder.append("void gateway");
        String _id_4 = Verzweigung.getId();
        _builder.append(_id_4, "\t\t");
        _builder.append("() :\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        EList<Edge> _outgoing_3 = Verzweigung.getOutgoing();
        String _verodern_3 = this.verodern(_outgoing_3);
        _builder.append(_verodern_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<End> _ends = model.getEnds();
      for(final End Ende : _ends) {
        _builder.append("\t\t");
        _builder.append("void end");
        String _id_5 = Ende.getId();
        _builder.append(_id_5, "\t\t");
        _builder.append("() :\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public String verodern(final EList<Edge> transitions) {
    String res = "";
    int i = 0;
    int _size = transitions.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _res = res;
      Edge _get = transitions.get(i);
      Node _targetElement = _get.getTargetElement();
      EClass _eClass = _targetElement.eClass();
      String _name = _eClass.getName();
      String _firstLower = StringExtensions.toFirstLower(_name);
      Edge _get_1 = transitions.get(i);
      Node _targetElement_1 = _get_1.getTargetElement();
      String _id = _targetElement_1.getId();
      String _plus = (_firstLower + _id);
      String _plus_1 = (_plus + "()");
      res = (_res + _plus_1);
      i++;
      while ((transitions.size() > i)) {
        {
          String _res_1 = res;
          Edge _get_2 = transitions.get(i);
          Node _targetElement_2 = _get_2.getTargetElement();
          EClass _eClass_1 = _targetElement_2.eClass();
          String _name_1 = _eClass_1.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
          String _plus_2 = (" | " + _firstLower_1);
          Edge _get_3 = transitions.get(i);
          Node _targetElement_3 = _get_3.getTargetElement();
          String _id_1 = _targetElement_3.getId();
          String _plus_3 = (_plus_2 + _id_1);
          String _plus_4 = (_plus_3 + "()");
          res = (_res_1 + _plus_4);
          i++;
        }
      }
    }
    return res;
  }
}

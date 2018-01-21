package generation;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Variable;
import graphmodel.Edge;
import graphmodel.Node;
import java.util.ArrayList;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Generator implements IGenerator<MeinEditor> {
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
    _builder.append("options");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("static = true;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("DEBUG_PARSER= true;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("LOOKAHEAD = 2;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("FORCE_LA_CHECK = true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("PARSER_BEGIN(SyntaxParser)");
    _builder.newLine();
    _builder.append("import java.io.FileReader;");
    _builder.newLine();
    _builder.append("public class SyntaxParser");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public static void main(String args []) throws Exception");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("FileReader reader = new FileReader(\"./assets/test.txt\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SyntaxParser parser = new SyntaxParser(reader);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("parser.parser();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("System.out.println(\"Syntax ist OK!  \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("PARSER_END(SyntaxParser)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("SKIP :");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\" \"");
    _builder.newLine();
    _builder.append("| \"\\r\"");
    _builder.newLine();
    _builder.append("| \"\\t\"");
    _builder.newLine();
    _builder.append("| \"\\n\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Start> _starts = model.getStarts();
      for(final Start Start : _starts) {
        _builder.append("void ");
        String _name = Start.getName();
        _builder.append(_name, "");
        _builder.append("() :\t");
        _builder.newLineIfNotEmpty();
        _builder.append("{}");
        _builder.newLine();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        String _createStartMethode = this.createStartMethode(Start);
        _builder.append(_createStartMethode, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.newLine();
    {
      EList<Gateway> _gateways = model.getGateways();
      for(final Gateway Gateway : _gateways) {
        {
          boolean _existiertGateway = this.existiertGateway(Gateway);
          if (_existiertGateway) {
            _builder.append("void ");
            String _id = Gateway.getId();
            _builder.append(_id, "");
            _builder.append("() :\t");
            _builder.newLineIfNotEmpty();
            _builder.append("{}");
            _builder.newLine();
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            String _createGatewayMethode = this.createGatewayMethode(Gateway);
            _builder.append(_createGatewayMethode, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("void parser() :");
    _builder.newLine();
    _builder.append("{}");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("(");
    EList<grafikeditor.meineditor.Start> _starts_1 = model.getStarts();
    grafikeditor.meineditor.Start _get = _starts_1.get(0);
    String _name_1 = _get.getName();
    _builder.append(_name_1, "  ");
    _builder.append("() \";\")+<EOF>");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public String createStartMethode(final Start start) {
    String res = "";
    EList<Node> _successors = start.getSuccessors();
    for (final Node n : _successors) {
      if ((n instanceof Terminal)) {
      } else {
        if ((n instanceof Gateway)) {
          String _res = res;
          String _id = ((Gateway)n).getId();
          String _plus = ("" + _id);
          String _plus_1 = (_plus + "()");
          res = (_res + _plus_1);
        }
      }
    }
    return res;
  }
  
  public String createGatewayMethode(final Gateway gateway) {
    String res = "";
    int count = 0;
    EList<Edge> _outgoing = gateway.getOutgoing();
    System.out.println(_outgoing);
    EList<Edge> _outgoing_1 = gateway.getOutgoing();
    for (final Edge e : _outgoing_1) {
      {
        Node targetElement = e.getTargetElement();
        boolean _or = false;
        if ((targetElement instanceof Terminal)) {
          _or = true;
        } else {
          _or = (targetElement instanceof Variable);
        }
        if (_or) {
          ArrayList<Node> terminalList = new ArrayList<Node>();
          this.suchenTerminal(e, terminalList);
          if ((count > 0)) {
            String _res = res;
            res = (_res + "|");
          }
          Gateway g = this.suchenGateway(e);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(g, null));
          if (!_notEquals) {
            _and = false;
          } else {
            boolean _existiertGateway = this.existiertGateway(g);
            _and = _existiertGateway;
          }
          if (_and) {
            String _res_1 = res;
            String _createText = this.createText(terminalList);
            res = (_res_1 + _createText);
            String _res_2 = res;
            String _id = g.getId();
            String _plus = ("[" + _id);
            String _plus_1 = (_plus + "()]");
            res = (_res_2 + _plus_1);
          } else {
            String _res_3 = res;
            String _createText_1 = this.createText(terminalList);
            res = (_res_3 + _createText_1);
          }
          count++;
        }
      }
    }
    return res;
  }
  
  public boolean existiertGateway(final Gateway gateway) {
    ArrayList<Node> terminalList = new ArrayList<Node>();
    EList<Edge> _outgoing = gateway.getOutgoing();
    for (final Edge edge : _outgoing) {
      this.suchenTerminal(edge, terminalList);
    }
    int _size = terminalList.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      return true;
    } else {
      return false;
    }
  }
  
  public Gateway suchenGateway(final Edge edge) {
    Node targetElement = edge.getTargetElement();
    if ((targetElement instanceof Gateway)) {
      return ((Gateway)targetElement);
    } else {
      if ((targetElement instanceof Terminal)) {
        EList<Edge> _outgoing = ((Terminal)targetElement).getOutgoing();
        Edge _get = _outgoing.get(0);
        return this.suchenGateway(_get);
      }
    }
    return null;
  }
  
  public void suchenTerminal(final Edge edge, final ArrayList<Node> list) {
    System.out.println(edge);
    Node targetElement = edge.getTargetElement();
    if ((targetElement instanceof Terminal)) {
      list.add(targetElement);
      EList<Edge> _outgoing = ((Terminal)targetElement).getOutgoing();
      Edge _get = _outgoing.get(0);
      this.suchenTerminal(_get, list);
    } else {
      if ((targetElement instanceof Variable)) {
        list.add(targetElement);
        EList<Edge> _outgoing_1 = ((Variable)targetElement).getOutgoing();
        Edge _get_1 = _outgoing_1.get(0);
        this.suchenTerminal(_get_1, list);
      }
    }
  }
  
  public String createText(final ArrayList<Node> list) {
    System.out.println(list);
    String res = "";
    for (final Node t : list) {
      if ((t instanceof Terminal)) {
        String _res = res;
        String _name = ((Terminal)t).getName();
        String _plus = ("\"" + _name);
        String _plus_1 = (_plus + "\"");
        res = (_res + _plus_1);
      } else {
        if ((t instanceof Variable)) {
          String _res_1 = res;
          String _name_1 = ((Variable)t).getName();
          String _plus_2 = ("" + _name_1);
          String _plus_3 = (_plus_2 + "()");
          res = (_res_1 + _plus_3);
        }
      }
    }
    return res;
  }
  
  public String getNode(final Node node) {
    String res = "";
    int count = 0;
    EList<Node> _successors = node.<Node>getSuccessors();
    for (final Node n : _successors) {
      {
        if ((n instanceof Terminal)) {
          String _res = res;
          String _name = ((Terminal)n).getName();
          String _plus = ("\"" + _name);
          String _plus_1 = (_plus + "\"");
          res = (_res + _plus_1);
          String _res_1 = res;
          String _node = this.getNode(n);
          res = (_res_1 + _node);
        } else {
          if ((n instanceof Variable)) {
            String _res_2 = res;
            String _name_1 = ((Variable)n).getName();
            String _plus_2 = ("" + _name_1);
            String _plus_3 = (_plus_2 + "()");
            res = (_res_2 + _plus_3);
            String _res_3 = res;
            String _node_1 = this.getNode(n);
            res = (_res_3 + _node_1);
          } else {
            if ((n instanceof Gateway)) {
              String _res_4 = res;
              String _name_2 = ((Gateway)n).getName();
              String _plus_4 = ("" + _name_2);
              String _plus_5 = (_plus_4 + "()");
              res = (_res_4 + _plus_5);
            }
          }
        }
        count++;
      }
    }
    return res;
  }
}

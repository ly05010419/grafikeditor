package pruefung;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.jface.dialogs.MessageDialog;

import de.jabc.cinco.meta.core.ge.style.model.customfeature.CincoCustomAction;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Variable;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.Start;
import graphmodel.Edge;
import graphmodel.Node;

public class Korrektheischeck extends CincoCustomAction<MeinEditor> {

	String variableName = "";

	public Korrektheischeck(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canExecute(MeinEditor arg0) throws ClassCastException {

		return true;
	}

	@Override
	public void execute(MeinEditor meinEditor) {

		pruefungAlleVariable(meinEditor);

		pruefungTerminalRücksprung(meinEditor);

		pruefungAlleGatewayRücksprung(meinEditor);

	}

	public void pruefungAlleGatewayRücksprung(MeinEditor meinEditor) {

		String message = "";

		boolean flag = true;

		for (Gateway gateway : meinEditor.getGateways()) {
			if (!pruefungGatewayRücksprung(meinEditor, gateway)) {
				flag = false;
				variableName = gateway.getName();
			}
		}

		if (flag) {
			message = "keine GatewayRücksprung ";

		} else {
			message = "GatewayRücksprung darf nicht!";
		}

		MessageDialog.openInformation(null, "Ergebnis:", message);

	}

	public boolean pruefungGatewayRücksprung(MeinEditor meinEditor,
			Gateway gateway) {
		boolean flag = true;

		for (Edge n : gateway.getOutgoing()) {

			Node node = n.getTargetElement();
			if (node.equals(gateway)) {
				flag = false;
			}

		}

		return flag;

	}

	public void pruefungTerminalRücksprung(MeinEditor meinEditor) {

		String message = "";

		boolean flag = true;

		for (Terminal terminal : meinEditor.getTerminals()) {
			if (!pruefungVariableRücksprung(meinEditor, terminal)) {
				flag = false;
				variableName = terminal.getName();
			}
		}

		if (flag) {
			message = "keine VariableRücksprung";

		} else {
			message = "VariableRücksprung darf nicht!";
		}

		MessageDialog.openInformation(null, "Ergebnis:", message);

	}

	public boolean pruefungVariableRücksprung(MeinEditor meinEditor,
			Terminal terminal) {
		boolean flag = true;

		for (Edge n : terminal.getOutgoing()) {

			Node node = n.getTargetElement();
			if (node.equals(terminal)) {
				flag = false;
			}

		}

		return flag;

	}

	public void pruefungAlleVariable(MeinEditor meinEditor) {
		String message = "";

		boolean flag = true;

		for (Variable variable : meinEditor.getVariables()) {
			if (!pruefungVariable(meinEditor, variable)) {
				flag = false;
				variableName = variable.getName();
			}
		}

		if (flag) {
			message = "VariableNamen sind OK!";

		} else {
			message = variableName + " existiert nicht!";
		}

		MessageDialog.openInformation(null, "Ergebnis:", message);

	}

	public boolean pruefungVariable(MeinEditor meinEditor, Variable variable) {
		boolean flag = false;
		for (Start start : meinEditor.getStarts()) {
			if (start.getName().equals(variable.getName())) {
				flag = true;
			}
		}
		return flag;
	}

}

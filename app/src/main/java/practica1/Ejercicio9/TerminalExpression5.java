package practica1.Ejercicio9;

public class TerminalExpression5 extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("5")) {
			context.setOutput(context.getOutput() + "V ");
			context.setInput(context.getInput().substring(1));
		}

	}

}

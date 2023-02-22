package practica1.Ejercicio9;

public class TerminalExpression6789 extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("6")) {
			context.setOutput(context.getOutput() + "VI ");
		} else if (context.getInput().startsWith("7")) {
			context.setOutput(context.getOutput() + "VII ");
		} else if (context.getInput().startsWith("8")) {
			context.setOutput(context.getOutput() + "VIII ");
		} else {
			context.setOutput(context.getOutput() + "IX ");
		}
		context.setInput(context.getInput().substring(1));

	}

}

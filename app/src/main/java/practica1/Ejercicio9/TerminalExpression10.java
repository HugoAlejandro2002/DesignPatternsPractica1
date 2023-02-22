package practica1.Ejercicio9;

public class TerminalExpression10 extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("10")) {
			context.setOutput(context.getOutput() + "X ");
			context.setInput(context.getInput().substring(2));
		}

	}

}

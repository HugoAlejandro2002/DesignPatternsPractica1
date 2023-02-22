package practica1.Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression {
	private List<AbstractExpression> grammar = new ArrayList<>();
	private Context context;

	public NonTerminalExpression(String input) {
		context = new Context(input.replace(" ", ""));
		for (String snumber : input.split(" ")) {
			int number = Integer.parseInt(snumber);
			if (number < 5) {
				grammar.add(new TerminalExpression1234());
			} else if (number == 5) {
				grammar.add(new TerminalExpression5());
			} else if (number < 10) {
				grammar.add(new TerminalExpression6789());
			} else {
				grammar.add(new TerminalExpression10());
			}
		}
	}

	public String getOutput() {
		for (AbstractExpression expression : grammar) {
			expression.interpreter(context);
		}
		return context.getOutput();
	}

}

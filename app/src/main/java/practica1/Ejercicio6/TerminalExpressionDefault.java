package practica1.Ejercicio6;


public class TerminalExpressionDefault extends GherkinsExpression {

    public TerminalExpressionDefault(int expressionSize) {
        this.expressionSize = expressionSize;
    }
    @Override
    public void interpreter(Context context) {
        context.output += context.input.substring(0, expressionSize);
        context.input = context.input.substring(expressionSize);
    }
}

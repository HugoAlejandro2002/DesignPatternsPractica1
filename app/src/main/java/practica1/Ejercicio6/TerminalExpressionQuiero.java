package practica1.Ejercicio6;


public class TerminalExpressionQuiero extends GherkinsExpression {

    public TerminalExpressionQuiero(int expressionSize) {
        this.expressionSize = expressionSize;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")) {
            context.output += "When";
            context.input = context.input.substring(expressionSize);
        }
    }
}

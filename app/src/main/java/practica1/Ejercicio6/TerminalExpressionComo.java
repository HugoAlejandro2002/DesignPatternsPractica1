package practica1.Ejercicio6;


public class TerminalExpressionComo extends GherkinsExpression {

    public TerminalExpressionComo(int expressionSize) {
        this.expressionSize = expressionSize;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")) {
            context.output += "Given";
            context.input = context.input.substring(expressionSize);
        }
    }
}

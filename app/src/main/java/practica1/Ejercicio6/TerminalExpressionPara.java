package practica1.Ejercicio6;


public class TerminalExpressionPara extends GherkinsExpression {

    public TerminalExpressionPara(int expressionSize) {
        this.expressionSize = expressionSize;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")) {
            context.output += "Then";
            context.input = context.input.substring(expressionSize);
        }
    }
}

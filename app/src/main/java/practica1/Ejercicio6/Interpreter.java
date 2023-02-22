package practica1.Ejercicio6;


import java.util.ArrayList;
import java.util.List;

public class Interpreter extends GherkinsExpression {
    private List<GherkinsExpression> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String messageToInterpret) {
        // Quitando espacios en blanco - regla gramatica
        context = new Context(messageToInterpret.replace(" ", ""));
        for(String  originalChar : messageToInterpret.split(" ")){
            switch (originalChar) {
                case "Como":
                    grammar.add(new TerminalExpressionComo(originalChar.length()));
                    break;
                case "Para":
                    grammar.add(new TerminalExpressionPara(originalChar.length()));
                    break;
                case "Quiero":
                    grammar.add(new TerminalExpressionQuiero(originalChar.length()));
                    break;
                default:
                    grammar.add(new TerminalExpressionDefault(originalChar.length()));
                    break;
            }
        }
    }

    public String evaluateMSG() {
        for(int i = 0; i < grammar.size(); i++){
            grammar.get(i).interpreter(context);
            if(i != grammar.size() - 1) context.output += " ";
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        throw new UnsupportedOperationException("NonTerminalExpressionParser no puede interpretar una expresion");
    }
}

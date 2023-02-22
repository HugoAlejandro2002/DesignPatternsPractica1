package practica1.Ejercicio9;

public class Main {
	public static void main(String[] args) {
		String numeros = "1 2 3 4 5 6 7 8 9 10";
		NonTerminalExpression nonTerminalExpression = new NonTerminalExpression(numeros);
		String output = nonTerminalExpression.getOutput();
		System.out.println(numeros);
		System.out.println(output);
	}
}

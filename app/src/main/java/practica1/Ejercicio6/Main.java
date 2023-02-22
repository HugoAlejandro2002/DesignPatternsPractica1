package practica1.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        String input = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Interpreter parser = new Interpreter(input);
        System.out.println("Output del Mensaje Interpretado");
        System.out.println(parser.evaluateMSG());
    }
}

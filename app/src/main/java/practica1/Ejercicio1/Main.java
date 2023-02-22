package practica1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        VentanillaMatriculacion ventanilla = VentanillaMatriculacion.getInstance();
        ventanilla.setCodigoCajero("123");
        System.out.println("Cajero: " + ventanilla.getCodigoCajero());

        // Estudiantes realizando matriculación
        ventanilla.agregarMonto(100);
        ventanilla.agregarMonto(200);
        ventanilla.agregarMonto(150);
        ventanilla.agregarMonto(300);
        ventanilla.agregarMonto(175);

        // Obtener el monto acumulado
        int montoAcumulado = ventanilla.getMontoAcumulado();
        System.out.println("Monto acumulado: " + montoAcumulado);
    }
}

package practica1.Ejercicio1;

public class VentanillaMatriculacion {
    private static VentanillaMatriculacion instance = null;
    private int montoAcumulado;
    private String codigoCajero;

    private VentanillaMatriculacion() {
        this.montoAcumulado = 0;
    }

    public static VentanillaMatriculacion getInstance() {
        if (instance == null) {
            instance = new VentanillaMatriculacion();
        }
        return instance;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public void agregarMonto(int monto) {
        this.montoAcumulado += monto;
    }

    public int getMontoAcumulado() {
        return this.montoAcumulado;
    }

    public String getCodigoCajero() {
        return this.codigoCajero;
    }
}

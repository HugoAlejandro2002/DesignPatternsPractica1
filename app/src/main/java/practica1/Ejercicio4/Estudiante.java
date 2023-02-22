package practica1.Ejercicio4;

public class Estudiante {
    private String nombre;
    private String ci;

    public Estudiante(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}

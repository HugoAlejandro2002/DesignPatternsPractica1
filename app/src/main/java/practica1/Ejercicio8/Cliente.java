package practica1.Ejercicio8;

public class Cliente {
	private String nombre;
	private String apellido;
	private double dinero = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void realizarPrestamo(Cajero cajero) {
		dinero += cajero.retirarPrestamo();
	}

}

package practica1.Ejercicio7;


public class Empleado {
	private String nombre;
	private String apellido;
	private String codigo;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Empleado(String nombre, String apellido, String codigo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
	}

	public void showInfo() {
		System.out.println();
		System.out.println("con ID: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println();
	}
}

package practica1.Ejercicio7;


import java.util.Vector;

public class EmployeeVector implements IAggregate {
	private Vector<Empleado> empleados = new Vector<>();
	private String gerente;

	public Vector<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Vector<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public EmployeeVector(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new EmployeeVectorIterator(empleados);
		return iterator;
	}

}

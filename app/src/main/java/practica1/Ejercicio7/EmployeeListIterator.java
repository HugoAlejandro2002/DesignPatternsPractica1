package practica1.Ejercicio7;


import java.util.List;

public class EmployeeListIterator implements Iterator {
	private List<Empleado> empleados;
	private int position = 0;

	public EmployeeListIterator(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public boolean hasNext() {
		boolean itHasNext = this.empleados.size() != 0 && position < this.empleados.size();
		return itHasNext;
	}

	@Override
	public Empleado next() {
		Empleado empleado = this.empleados.get(position++);
		return empleado;
	}

}

package practica1.Ejercicio7;

import java.util.Stack;

public class EmployeeStackIterator implements Iterator {

	private Stack<Empleado> empleados;
	
	
	public EmployeeStackIterator(Stack<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public boolean hasNext() {
		boolean itHasNext = !empleados.isEmpty();
		return itHasNext;
	}

	@Override
	public Empleado next() {
		Empleado empleado = empleados.peek();
		empleados.pop();
		return empleado;
	}

}

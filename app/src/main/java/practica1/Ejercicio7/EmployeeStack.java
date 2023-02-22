package practica1.Ejercicio7;


import java.util.Stack;

public class EmployeeStack implements IAggregate {
	private Stack<Empleado> empleados;

	public Stack<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Stack<Empleado> empleados) {
		this.empleados = empleados;
	}

	public EmployeeStack() {

	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new EmployeeStackIterator(empleados);
		return iterator;
	}

}

package practica1.Ejercicio7;

public class EmployeeArray implements IAggregate {
	private Empleado empleados[];

	public Empleado[] getEmpleado() {
		return empleados;
	}

	public void setEmpleado(Empleado[] empleado) {
		this.empleados = empleado;
	}



	public EmployeeArray() {
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new EmployeeArrayIterator(empleados);
		return iterator;
	}

}

package practica1.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements IAggregate {
	private List<Empleado> empleados = new ArrayList<>();

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public EmployeeList() {
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new EmployeeListIterator(empleados);
		return iterator;
	}

}

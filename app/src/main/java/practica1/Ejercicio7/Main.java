package practica1.Ejercicio7;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		EmployeeList empresaA = new EmployeeList();
		List<Empleado> empleadosEmpresaA = new LinkedList<>();
		empleadosEmpresaA.add(new Empleado("Juan", "Perez", "JP1"));
		empleadosEmpresaA.add(new Empleado("Juan", "Perez 2", "JP2")); 
		empleadosEmpresaA.add(new Empleado("Juan", "Perez 3", "JP3"));
		empresaA.setEmpleados(empleadosEmpresaA);

		EmployeeArray empresaB = new EmployeeArray();
		Empleado empleadosempresaB[] = new Empleado[2];
		empleadosempresaB[0] = new Empleado("Carlos", "Garcia", "CG1");
		empleadosempresaB[1] = new Empleado("Carlos", "Garcia 2", "CG2");
		empresaB.setEmpleado(empleadosempresaB);

		EmployeeVector empresaC = new EmployeeVector("Gaston Espinoza");
		Vector<Empleado> empleadosempresaC = new Vector<>();
		empleadosempresaC.add(new Empleado("Johan", "Doe", "JD1"));
		empleadosempresaC.add(new Empleado("Johan", "Doe 2", "JD2"));
		empresaC.setEmpleados(empleadosempresaC);

		EmployeeStack empresaD = new EmployeeStack();
		Stack<Empleado> empleadosEmpresaD = new Stack<>();
		empleadosEmpresaD.push(new Empleado("Vicente", "Fernandez", "VF1"));
		empleadosEmpresaD.push(new Empleado("Vicente", "Fernandez", "VF2"));
		empresaD.setEmpleados(empleadosEmpresaD);

		HashMap<String, Empleado> listaGeneral = new HashMap<>();
		Iterator iterator = empresaA.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = empresaB.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = empresaC.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = empresaD.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}
		
		for (HashMap.Entry<String, Empleado> entry : listaGeneral.entrySet()) {
			entry.getValue().showInfo();
		}


	}

}

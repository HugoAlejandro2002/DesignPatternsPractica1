package practica1.Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Cabina {
	private static Cabina cabinaControl;
	private List<Vehiculo> vehiculosTemp;
	private List<Vehiculo> vehiculosGlobal;
	private double dineroRecaudado;

	private Cabina() {
		this.vehiculosTemp = new ArrayList<>();
		this.vehiculosGlobal = new ArrayList<>();
	}

	public static Cabina getInstance() {
		if (cabinaControl == null) {
			cabinaControl = new Cabina();
		}
		return cabinaControl;
	}

	public void registrarVehiculo(Vehiculo vehiculo) {
		vehiculosTemp.add(vehiculo);
		vehiculosGlobal.add(vehiculo);
		if (vehiculo.isTransportePesado()) {
			dineroRecaudado += 200;
		} else {
			dineroRecaudado += 10;
		}
		if (vehiculosTemp.size() == 6) {
			System.out.println("Informe obligatorio constante de vehiculos registrados:");
			for (Vehiculo ultimoVehiculo : vehiculosTemp) {
				ultimoVehiculo.showInfo();
			}
			vehiculosTemp.clear();
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("registro ultimos vehiculos:");
		for (Vehiculo ultimoVehiculo : vehiculosTemp) {
			ultimoVehiculo.showInfo();
		}
		System.out.println("registro de Todos:");
		for (Vehiculo vehiculoRegistrado : vehiculosGlobal) {
			vehiculoRegistrado.showInfo();
		}
		System.out.println("Dinero Recaudado: " + dineroRecaudado);
		System.out.println();
	}
}

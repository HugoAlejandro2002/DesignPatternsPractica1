package practica1.Ejercicio10;

public class Main {
	public static void main(String[] args) {
		CabinaControl cabinaControl = CabinaControl.getInstance();
		cabinaControl.showInfo();

		Vehiculo vehiculos[] = { new Vehiculo("Peta", "2134369", "12222093", false),
				new Vehiculo("Taxi", "AAA4%56", "42212310", false),
				new Vehiculo("Caldina", "F7878FR", "9984839", false),
				new Vehiculo("Minibys", "B37234", "87699832", false),
				new Vehiculo("Caterpillar", "ADGASF2", "765678765", true),
				new Vehiculo("Micro", "HGF4429", "91971782", false),
				new Vehiculo("Patito", "567YGH", "123429", false) };

		for (Vehiculo vehiculo : vehiculos) {
			cabinaControl.registrarVehiculo(vehiculo);
		}
		
		cabinaControl.showInfo();
	}
}

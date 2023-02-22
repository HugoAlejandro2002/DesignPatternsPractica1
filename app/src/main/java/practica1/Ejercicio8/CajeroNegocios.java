package practica1.Ejercicio8;


public class CajeroNegocios extends Cajero {

	@Override
	public void showInfo() {
		System.out.println("Negocios");
		System.out.println("Bienvenido a " + super.getNombre());
		System.out.println("Accede a prestamos de: " + super.getTipoPrestamos());
		System.out.println("Se te ofrece: " + super.getMontoPrestamos());
		System.out.println();
	}

}

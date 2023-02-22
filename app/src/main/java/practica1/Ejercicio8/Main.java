package practica1.Ejercicio8;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		CuentaFondosBanco.getInstance().showInfo();
		Cliente cliente1 = new Cliente("Russell", "Cayllan");
		Cliente cliente2 = new Cliente("Cox", "Posto");
		Cliente cliente3 = new Cliente("Cristhofer", "Apaza");
		Cliente cliente4 = new Cliente("Dahir", "Mamani");

		Cajero cajeroCreditos = new CajeroCreditosCreator().generateCajero();
		Cajero cajeroFinanciamento = new CajeroFinanciamientoCreator().generateCajero();
		Cajero cajeroNegocios = new CajeroNegociosCreator().generateCajero();
		Cajero cajeroVivienda = new CajeroViviendaCreator().generateCajero();

		Thread user1 = new Thread(new Runnable() {
			@Override
			public void run() {
				cliente1.realizarPrestamo(cajeroVivienda);
			}
		});

		Thread user2 = new Thread(new Runnable() {
			@Override
			public void run() {
				cliente2.realizarPrestamo(cajeroNegocios);
			}
		});

		Thread user3 = new Thread(new Runnable() {
			@Override
			public void run() {
				cliente3.realizarPrestamo(cajeroFinanciamento);
			}
		});

		Thread user4 = new Thread(new Runnable() {
			@Override
			public void run() {
				cliente4.realizarPrestamo(cajeroCreditos);
			}
		});

		user1.start();
		user2.start();
		user3.start();
		user4.start();

		Thread.sleep(2000);
		CuentaFondosBanco.getInstance().showInfo();
	}
}

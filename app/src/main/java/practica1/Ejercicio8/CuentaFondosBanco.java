package practica1.Ejercicio8;

public class CuentaFondosBanco {
	private static CuentaFondosBanco cuentaFondosBanco;
	private double dineroTotal;
	private String codigo = "Banco Total";

	private CuentaFondosBanco() {
		this.dineroTotal = 5000.00;
	}

	public synchronized static CuentaFondosBanco getInstance() {
		if (cuentaFondosBanco == null) {
			cuentaFondosBanco = new CuentaFondosBanco();
		}
		return cuentaFondosBanco;
	}

	public synchronized void retirarDinero(double monto) {
		dineroTotal = dineroTotal - monto;
	}

	public synchronized boolean solicitudRetiro(double monto) {
		boolean solicitud = monto <= dineroTotal;
		return solicitud;
	}

	public void showInfo() {
		System.out.println("Banco Andersaurio");
		System.out.println("Id de banco: " + codigo);
		System.out.println("Dinero total: " + dineroTotal);
	}
}

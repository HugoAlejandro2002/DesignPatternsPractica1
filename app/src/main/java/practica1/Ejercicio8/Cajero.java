package practica1.Ejercicio8;


public abstract class Cajero {
	private CuentaFondosBanco cuentaFondosBanco;
	private String nombre;
	private String tipoPrestamos;
	private double montoPrestamos;

	public CuentaFondosBanco getCuentaFondosBanco() {
		return cuentaFondosBanco;
	}

	public void setCuentaFondosBanco(CuentaFondosBanco cuentaFondosBanco) {
		this.cuentaFondosBanco = cuentaFondosBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoPrestamos() {
		return tipoPrestamos;
	}

	public void setTipoPrestamos(String tipoPrestamos) {
		this.tipoPrestamos = tipoPrestamos;
	}

	public double getMontoPrestamos() {
		return montoPrestamos;
	}

	public void setMontoPrestamos(double montoPrestamos) {
		this.montoPrestamos = montoPrestamos;
	}

	public double retirarPrestamo() {
		if (cuentaFondosBanco.solicitudRetiro(montoPrestamos)) {
			cuentaFondosBanco.retirarDinero(montoPrestamos);
			System.out.println("Se hizo un prestamo de tipo " + tipoPrestamos + " de " + montoPrestamos);
			return montoPrestamos;
		} else {
			System.out.println("No hay dinero suficiente para este prestamo de " + tipoPrestamos + "!\nLo siento!");
			return 0;
		}
	}

	public abstract void showInfo();
}

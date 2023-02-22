package practica1.Ejercicio8;


public class CajeroFinanciamientoCreator implements ICreator {

	@Override
	public Cajero generateCajero() {
		CajeroFinanciamiento cajeroFinanciamiento = new CajeroFinanciamiento();
		cajeroFinanciamiento.setNombre("Financiamiento");
		cajeroFinanciamiento.setTipoPrestamos("financiamiento");
		cajeroFinanciamiento.setMontoPrestamos(900);
		cajeroFinanciamiento.setCuentaFondosBanco(CuentaFondosBanco.getInstance());
		cajeroFinanciamiento.showInfo();
		return cajeroFinanciamiento;
	}

}

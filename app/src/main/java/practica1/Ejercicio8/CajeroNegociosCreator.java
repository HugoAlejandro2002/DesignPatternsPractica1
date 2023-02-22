package practica1.Ejercicio8;


public class CajeroNegociosCreator implements ICreator {

	@Override
	public Cajero generateCajero() {
		CajeroNegocios cajeroNegocios = new CajeroNegocios();
		cajeroNegocios.setNombre("Negocios");
		cajeroNegocios.setTipoPrestamos("negocios");
		cajeroNegocios.setMontoPrestamos(500);
		cajeroNegocios.setCuentaFondosBanco(CuentaFondosBanco.getInstance());
		cajeroNegocios.showInfo();
		return cajeroNegocios;
	}

}

package practica1.Ejercicio8;


public class CajeroViviendaCreator implements ICreator {

	@Override
	public Cajero generateCajero() {
		CajeroVivienda cajeroVivienda = new CajeroVivienda();
		cajeroVivienda.setNombre("Vivienda");
		cajeroVivienda.setTipoPrestamos("vivienda");
		cajeroVivienda.setMontoPrestamos(300);
		cajeroVivienda.setCuentaFondosBanco(CuentaFondosBanco.getInstance());
		cajeroVivienda.showInfo();
		return cajeroVivienda;
	}

}

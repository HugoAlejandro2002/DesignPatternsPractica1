package practica1.Ejercicio8;


public class CajeroCreditosCreator implements ICreator {

	@Override
	public Cajero generateCajero() {
		CajeroCreditos cajeroCreditos = new CajeroCreditos();
		cajeroCreditos.setNombre("Credito");
		cajeroCreditos.setTipoPrestamos("creditos");
		cajeroCreditos.setMontoPrestamos(700);
		cajeroCreditos.setCuentaFondosBanco(CuentaFondosBanco.getInstance());
		cajeroCreditos.showInfo();
		return cajeroCreditos;
	}

}

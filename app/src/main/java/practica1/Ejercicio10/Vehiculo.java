package practica1.Ejercicio10;

public class Vehiculo {
	private String modelo;
	private String placa;
	private String ciDuenio;
	private boolean isTransportePesado;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCiDuenio() {
		return ciDuenio;
	}

	public void setCiDuenio(String ciDuenio) {
		this.ciDuenio = ciDuenio;
	}

	public boolean isTransportePesado() {
		return isTransportePesado;
	}

	public void setTransportePesado(boolean isTransportePesado) {
		this.isTransportePesado = isTransportePesado;
	}

	public Vehiculo(String modelo, String placa, String ciDuenio, boolean isTransportePesado) {
		this.modelo = modelo;
		this.placa = placa;
		this.ciDuenio = ciDuenio;
		this.isTransportePesado = isTransportePesado;
	}

	public void showInfo() {
		System.out.println();
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("es Transporte Pesado?: " + isTransportePesado);
		System.out.println("CI duenio: " + ciDuenio);
		System.out.println();
	}
}

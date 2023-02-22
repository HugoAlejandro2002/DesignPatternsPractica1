package practica1.Ejercicio3;

public class KitEscolar implements IKit {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno[] cuadernos;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuaderno[] cuadernos) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuadernos = cuadernos;
        System.out.println("Creando Kit Escolar");
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno[] getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuaderno[] cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void showInfo() {
        System.out.println("Mochila: " + mochila.getTamanio() + " " + mochila.getNumeroBolsillos());
        System.out.println("Deportivo: " + deportivo.getColor() + " " + deportivo.getNumeroPrendas() + " " + deportivo.getTalla());
        System.out.println("Cuadernos: ");
        for (int i = 0; i < cuadernos.length; i++) {
            System.out.print("Cuaderno " + (i + 1) + " con info: "+ "Numero Hojas: " + cuadernos[i].getNumeroHojas() + ", Tipo: " + cuadernos[i].getTipo());
            if (i < cuadernos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

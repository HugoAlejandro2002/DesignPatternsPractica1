package practica1.Ejercicio3;


public class CreatorKitEscolar extends Creator {

    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setTamanio(12);
        mochila.setNumeroBolsillos(3);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Azul");
        deportivo.setNumeroPrendas(2);
        deportivo.setTalla("M");

        Cuaderno[] cuadernos = new Cuaderno[2];
        cuadernos[0] = new Cuaderno();
        cuadernos[0].setNumeroHojas(100);
        cuadernos[0].setTipo("Empastado");
        cuadernos[1] = new Cuaderno();
        cuadernos[1].setNumeroHojas(200);
        cuadernos[1].setTipo("Carpeta");

        KitEscolar product = new KitEscolar(mochila, deportivo, cuadernos);
        return product;
    }

}
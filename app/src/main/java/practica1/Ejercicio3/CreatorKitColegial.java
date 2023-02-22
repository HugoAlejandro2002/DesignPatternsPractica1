package practica1.Ejercicio3;


public class CreatorKitColegial extends Creator {

    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(5);
        mochila.setTamanio(12);

        Libro[] libros = new Libro[2];
        libros[0] = new Libro();
        libros[0].setAutor("Carlos Fernandez");
        libros[0].setTipo("Novela");
        libros[1] = new Libro();
        libros[1].setAutor("Juan Perez");
        libros[1].setTipo("Comedia");

        Computadora computadora = new Computadora();
        computadora.setMarca("HP");
        computadora.setOs("Windows");

        KitColegial product = new KitColegial(mochila, libros, computadora);
        return product;
    }

}
package practica1.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        BuilderPlatoParrilla bife = new Bife();
        BuilderPlatoParrilla lomito = new Lomito();
        BuilderPlatoParrilla tira = new Tira();

        System.out.println("Bife");
        restaurante.setBuilder(bife);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido1 = restaurante.getPlatoParrilla();
        pedido1.showInfo();

        System.out.println("Tira");
        restaurante.setBuilder(tira);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido3 = restaurante.getPlatoParrilla();
        pedido3.showInfo();

        
        System.out.println("Lomito");
        restaurante.setBuilder(lomito);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido2 = restaurante.getPlatoParrilla();
        pedido2.showInfo();
    }
}

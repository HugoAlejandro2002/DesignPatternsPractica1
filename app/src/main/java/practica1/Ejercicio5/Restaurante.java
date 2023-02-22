package practica1.Ejercicio5;


public class Restaurante {

    private BuilderPlatoParrilla builder;

    public PlatoParrilla getPlatoParrilla() {
        return builder.getPlatoParrilla();
    }

    public void setBuilder(BuilderPlatoParrilla builder) {
        this.builder = builder;
    }

    public void buildPlatoParrilla() {
        this.builder.createPlatoParrilla();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}

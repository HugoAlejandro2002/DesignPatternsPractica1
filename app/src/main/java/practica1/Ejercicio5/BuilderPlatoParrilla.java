package practica1.Ejercicio5;


public abstract class BuilderPlatoParrilla {
    protected PlatoParrilla platoParrilla;

    public PlatoParrilla getPlatoParrilla() {
        return platoParrilla;
    }

    public void createPlatoParrilla() {
        this.platoParrilla = new PlatoParrilla();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}

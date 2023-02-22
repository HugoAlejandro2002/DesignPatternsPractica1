package practica1.Ejercicio5;

public class Lomito extends BuilderPlatoParrilla {
    @Override
    public void buildTipoDeCarne() {
        this.platoParrilla.setTipoDeCarne("lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.platoParrilla.setSaborRefresco("pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.platoParrilla.setGuarniciones("arroz");
    }
}

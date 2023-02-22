package practica1.Ejercicio5;


public class Bife extends BuilderPlatoParrilla {
    @Override
    public void buildTipoDeCarne() {
        this.platoParrilla.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.platoParrilla.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.platoParrilla.setGuarniciones("papasFritas");
    }
}

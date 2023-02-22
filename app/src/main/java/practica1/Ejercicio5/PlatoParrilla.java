package practica1.Ejercicio5;


public class PlatoParrilla {
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public PlatoParrilla() {

    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showInfo(){
        System.out.println("Tipo de carne: " + this.tipoDeCarne);
        System.out.println("Sabor del refresco: " + this.saborRefresco);
        System.out.println("Guarniciones: " + this.guarniciones);
    }
}

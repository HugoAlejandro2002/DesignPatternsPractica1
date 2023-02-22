package practica1.Ejercicio2;

public class Contract implements IContract {

    private double sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;

    public Contract(double sueldo, int cargaHoraria, boolean cursoEducacionSuperior, boolean accesoPlataforma,
                             boolean marcadoBiometrico, String marcadoHoraEntrada, String marcadoHoraSalida,
                             String nombre, String apellido) {
        this.sueldo = sueldo;
        this.cargaHoraria = cargaHoraria;
        this.cursoEducacionSuperior = cursoEducacionSuperior;
        this.accesoPlataforma = accesoPlataforma;
        this.marcadoBiometrico = marcadoBiometrico;
        this.marcadoHoraEntrada = marcadoHoraEntrada;
        this.marcadoHoraSalida = marcadoHoraSalida;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Contract() {
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        return new Contract(this.sueldo, this.cargaHoraria, this.cursoEducacionSuperior,
                this.accesoPlataforma, this.marcadoBiometrico, this.marcadoHoraEntrada,
                this.marcadoHoraSalida, this.nombre, this.apellido);
    }

    public void showInfo(){
        System.out.println("Contrato [sueldo=" + sueldo + ", cargaHoraria=" + cargaHoraria + 
        ", cursoEducacionSuperior=" + cursoEducacionSuperior + ", accesoPlataforma=" + 
        accesoPlataforma + ", marcadoBiometrico=" + marcadoBiometrico + 
        ", marcadoHoraEntrada=" + marcadoHoraEntrada + ", marcadoHoraSalida=" + 
        marcadoHoraSalida + ", nombre=" + nombre + ", apellido=" + apellido + "]");
        
    }
}


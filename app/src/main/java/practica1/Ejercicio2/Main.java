package practica1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Contract Contract = new Contract();
        Contract.setSueldo(5000);
        Contract.setCargaHoraria(80);
        Contract.setCursoEducacionSuperior(true);
        Contract.setAccesoPlataforma(true);
        Contract.setMarcadoBiometrico(false);
        Contract.setMarcadoHoraEntrada("08:00");
        Contract.setMarcadoHoraSalida("18:00");
        Contract.setNombre("Carlos");
        Contract.setApellido("Ramirez");

        // Create 15 contracts based on the prototype
        Contract[] contracts = new Contract[15];
        for (int i = 0; i < contracts.length; i++) {
            contracts[i] = (Contract) Contract.clone();
            contracts[i].setNombre("Carlos " + i);
            contracts[i].showInfo();;
        }
    }
}

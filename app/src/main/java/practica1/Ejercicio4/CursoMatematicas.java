package practica1.Ejercicio4;

public class CursoMatematicas extends Curso {

    public CursoMatematicas() {

    }

    @Override
    public void inscribir(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    @Override
    void mostrarEstudiantesInscritos() {
        System.out.println("Estudiantes inscritos en el curso de Matematicas");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println("* Estudiante: " + estudiante.getNombre() + ", de CI: " + estudiante.getCi());
        }
    }

}

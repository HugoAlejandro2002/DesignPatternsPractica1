package practica1.Ejercicio4;

public class CursoIngles extends Curso {

    public CursoIngles() {

    }

    @Override
    void inscribir(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    @Override
    void mostrarEstudiantesInscritos() {
        System.out.println("Estudiantes inscritos en el curso de Ingles");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println("* Estudiante: " + estudiante.getNombre() + ", de CI: " + estudiante.getCi());
        }
    }
}

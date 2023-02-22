package practica1.Ejercicio4;

public class CursoHistoria extends Curso {

    public CursoHistoria() {

    }

    @Override
    void inscribir(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    @Override
    void mostrarEstudiantesInscritos() {
        System.out.println("Estudiantes inscritos en el curso de Historia:");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println("* Estudiante: " + estudiante.getNombre() + ", de  CI: " + estudiante.getCi());
        }
    }

}

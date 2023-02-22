package practica1.Ejercicio4;

public class CursoLenguaje extends Curso {

    public CursoLenguaje() {

    }

    @Override
    void inscribir(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    @Override
    void mostrarEstudiantesInscritos() {
        System.out.println("Estudiantes inscritos en el curso de Lenguaje");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println("* Estudiante: " + estudiante.getNombre() + ", de CI: " + estudiante.getCi());
        }
    }
}

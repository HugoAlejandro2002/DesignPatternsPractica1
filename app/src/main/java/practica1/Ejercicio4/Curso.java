package practica1.Ejercicio4;

import java.util.ArrayList;

public abstract class Curso {
    protected ArrayList<Estudiante> estudiantesInscritos = new ArrayList<>();

    abstract void inscribir(Estudiante estudiante);

    abstract void mostrarEstudiantesInscritos();
}

package practica1.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("John", "6565");
        Estudiante estudiante2 = new Estudiante("Mary", "77777");
        Estudiante estudiante3 = new Estudiante("Peter", "12356");
        Estudiante estudiante4 = new Estudiante("Paul", "12999");
        Estudiante estudiante5 = new Estudiante("Juan", "67765");

        Curso cursoIngles = FactoryCurso.make("ingles");
        cursoIngles.inscribir(estudiante1);
        cursoIngles.inscribir(estudiante2);
        cursoIngles.mostrarEstudiantesInscritos();

        Curso cursoMatematicas = FactoryCurso.make("matematicas");
        cursoMatematicas.inscribir(estudiante3);
        cursoMatematicas.inscribir(estudiante1);
        cursoMatematicas.mostrarEstudiantesInscritos();

        Curso cursoLenguaje = FactoryCurso.make("lenguaje");
        cursoLenguaje.inscribir(estudiante4);
        cursoLenguaje.inscribir(estudiante5);
        cursoLenguaje.mostrarEstudiantesInscritos();

        Curso cursoCiencias = FactoryCurso.make("historia");
        cursoCiencias.inscribir(estudiante5);
        cursoCiencias.inscribir(estudiante3);
        cursoCiencias.inscribir(estudiante1);
        cursoCiencias.mostrarEstudiantesInscritos();



    }
}

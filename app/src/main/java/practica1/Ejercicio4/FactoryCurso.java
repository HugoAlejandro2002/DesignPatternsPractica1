package practica1.Ejercicio4;

public class FactoryCurso {
    public static Curso make(String nombreCurso) {
        Curso curso;
        switch (nombreCurso.toLowerCase()) {
            case "matematicas":
                curso = new CursoMatematicas();
                break;
            case "lenguaje":
                curso = new CursoLenguaje();
                break;
            case "historia":
                curso = new CursoHistoria();
                break;
            case "ingles":
                curso = new CursoIngles();
                break;
            default:
                throw new IllegalArgumentException("El curso no existe");
        }
        return curso;
    }
}

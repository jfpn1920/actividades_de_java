package nivel_de_practica;
class Curso {
    String nombreCurso;
    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void mostrarCurso() {
        System.out.println("curso: " + nombreCurso);
    }
}
class Estudiante {
    String nombre;
    double nota;
    Curso curso;
    public Estudiante(String nombre, double nota, Curso curso) {
        this.nombre = nombre;
        this.nota = nota;
        this.curso = curso;
    }
    public void mostrarEstudiante() {
        System.out.println("estudiante: " + nombre);
        curso.mostrarCurso();
        System.out.println("nota final: " + nota);
        System.out.println("---------------------------");
    }
}
public class sistema_academico_completo {
    public static void main(String[] args) {
        Curso curso1 = new Curso("programacion java");
        Estudiante estudiante1 = new Estudiante("juan", 4.5, curso1);
        Estudiante estudiante2 = new Estudiante("maria", 4.8, curso1);
        estudiante1.mostrarEstudiante();
        estudiante2.mostrarEstudiante();
    }
}
package constructores;
class Estudiante {
    String nombre;
    double nota;
    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
        System.out.println("se ha creado un objeto estudiante con constructor.");
    }
}
public class constructor_para_estudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("carlos", 4.5);
        Estudiante estudiante2 = new Estudiante("ana", 4.8);
        System.out.println("estudiante 1: " + estudiante1.nombre + " - nota: " + estudiante1.nota);
        System.out.println("estudiante 2: " + estudiante2.nombre + " - nota: " + estudiante2.nota);
    }
}
package constructores;
class Estudiante {
    String nombre;
    double nota;
    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
public class crear_varios_objetos_con_constructor {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("carlos", 4.5);
        Estudiante estudiante2 = new Estudiante("ana", 4.8);
        Estudiante estudiante3 = new Estudiante("luis", 4.2);
        System.out.println("estudiante 1: " + estudiante1.nombre + " - nota: " + estudiante1.nota);
        System.out.println("estudiante 2: " + estudiante2.nombre + " - nota: " + estudiante2.nota);
        System.out.println("estudiante 3: " + estudiante3.nombre + " - nota: " + estudiante3.nota);
    }
}
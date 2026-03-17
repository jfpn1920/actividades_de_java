package atributos;
class Estudiante {
    String nombre;
    double nota;
}
public class clase_estudiante_con_nombre_y_nota {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "carlos";
        estudiante1.nota = 4.5;
        System.out.println("nombre del estudiante: " + estudiante1.nombre);
        System.out.println("nota: " + estudiante1.nota);
    }
}
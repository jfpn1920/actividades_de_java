package clases_y_objetos_fundamentos;
class Estudiante {
    String nombre;
    int edad;
    String carrera;
}
public class crear_clase_estudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "juan";
        estudiante1.edad = 22;
        estudiante1.carrera = "ingenieria informatica";
        System.out.println("nombre: " + estudiante1.nombre);
        System.out.println("edad: " + estudiante1.edad);
        System.out.println("carrera: " + estudiante1.carrera);
    }
}
package proyecto_modular_basico;
public class entidades_en_model {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("carlos", 21);
        mostrarEstudiante(estudiante);
    }
    public static void mostrarEstudiante(Estudiante estudiante) {
        System.out.println("nombre: " + estudiante.nombre);
        System.out.println("edad: " + estudiante.edad);
    }
}
class Estudiante {
    String nombre;
    int edad;
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
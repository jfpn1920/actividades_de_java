package mini_sistemas_orientados_a_objetos;
class Estudiante {
    String nombre;
    int edad;
    String carrera;
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("carrera: " + carrera);
        System.out.println("----------------------");
    }
}
public class sistema_de_estudiantes {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("juan", 22, "ingenieria informatica");
        Estudiante estudiante2 = new Estudiante("maría", 21, "administracion");
        Estudiante estudiante3 = new Estudiante("carlos", 23, "derecho");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
    }
}
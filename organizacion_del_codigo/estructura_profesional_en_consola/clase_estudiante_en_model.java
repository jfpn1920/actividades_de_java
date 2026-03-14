package estructura_profesional_en_consola;
public class clase_estudiante_en_model {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("ana", 20, "ingeniería");
        estudiante1.mostrarDatos();
    }
}
class Estudiante {
    String nombre;
    int edad;
    String carrera;
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("carrera: " + carrera);
    }
}
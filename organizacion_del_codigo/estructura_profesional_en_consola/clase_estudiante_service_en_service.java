package estructura_profesional_en_consola;
public class clase_estudiante_service_en_service {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("carlos", 21, "informatica");
        EstudianteService servicio = new EstudianteService();
        servicio.mostrarEstudiante(estudiante1);
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
}
class EstudianteService {
    public void mostrarEstudiante(Estudiante e) {
        System.out.println("nombre: " + e.nombre);
        System.out.println("edad: " + e.edad);
        System.out.println("carrera: " + e.carrera);
    }
}
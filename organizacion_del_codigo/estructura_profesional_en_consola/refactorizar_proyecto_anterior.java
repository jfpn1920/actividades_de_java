package estructura_profesional_en_consola;
public class refactorizar_proyecto_anterior {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("laura", 23, "ingenieria de sistemas");
        EstudianteService servicio = new EstudianteService();
        VistaConsola vista = new VistaConsola();
        String informacion = servicio.obtenerInformacion(estudiante);
        vista.mostrarInformacion(informacion);
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
    public String obtenerInformacion(Estudiante e) {
        return "nombre: " + e.nombre +
            "\n edad: " + e.edad +
            "\n carrera: " + e.carrera;
    }
}
class VistaConsola {
    public void mostrarInformacion(String info) {
        System.out.println("informacion del estudiante");
        System.out.println(info);
    }
}
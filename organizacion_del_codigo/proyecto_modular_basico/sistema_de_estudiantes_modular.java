package proyecto_modular_basico;
public class sistema_de_estudiantes_modular {
    public static void main(String[] args) {
        String nombreEstudiante = obtenerNombreEstudiante();
        int edadEstudiante = obtenerEdadEstudiante();
        mostrarInformacionEstudiante(nombreEstudiante, edadEstudiante);
    }
    public static String obtenerNombreEstudiante() {
        return "juan";
    }
    public static int obtenerEdadEstudiante() {
        return 20;
    }
    public static void mostrarInformacionEstudiante(String nombre, int edad) {
        System.out.println("nombre del estudiante: " + nombre);
        System.out.println("edad del estudiante: " + edad);
    }
}
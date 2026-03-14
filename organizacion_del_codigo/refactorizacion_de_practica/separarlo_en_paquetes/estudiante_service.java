package refactorizacion_de_practica.separarlo_en_paquetes;
public class estudiante_service {
    public static String evaluarEstudiante(estudiante estudiante) {
        if (estudiante.getNota() >= 3.0) {
            return estudiante.getNombre() + " aprobó con nota " + estudiante.getNota();
        } else {
            return estudiante.getNombre() + " reprobó con nota " + estudiante.getNota();
        }
    }
}
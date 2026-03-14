package estructura_profesional_en_consola.crear_estructura_por_capas.src.app;
import estructura_profesional_en_consola.crear_estructura_por_capas.src.model.persona;
import estructura_profesional_en_consola.crear_estructura_por_capas.src.service.persona_service;
public class main_app {
    public static void main(String[] args) {
        persona persona1 = new persona("ana", 22);
        persona_service servicio = new persona_service();
        servicio.mostrarPersona(persona1);
    }
}
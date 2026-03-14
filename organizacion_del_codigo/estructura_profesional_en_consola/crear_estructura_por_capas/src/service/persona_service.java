package estructura_profesional_en_consola.crear_estructura_por_capas.src.service;
import estructura_profesional_en_consola.crear_estructura_por_capas.src.model.persona;
public class persona_service {
    public void mostrarPersona(persona p) {
        System.out.println("nombre: " + p.nombre);
        System.out.println("edad: " + p.edad);
    }
}
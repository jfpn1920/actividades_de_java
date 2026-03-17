package clases_y_objetos_fundamentos;
class Persona {
    String nombre;
    int edad;
}
public class crear_objeto_de_persona_usando_new {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "carlos";
        persona1.edad = 25;
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
    }
}

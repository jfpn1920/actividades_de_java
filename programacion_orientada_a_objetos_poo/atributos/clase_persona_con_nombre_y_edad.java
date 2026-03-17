package atributos;
class Persona {
    String nombre;
    int edad;
}
public class clase_persona_con_nombre_y_edad {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
    }
}
package constructores;
class Persona {
    String nombre;
    int edad;
    Persona() {
        System.out.println("se ha creado un objeto Persona.");
    }
}
public class constructor_vacio {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
    }
}
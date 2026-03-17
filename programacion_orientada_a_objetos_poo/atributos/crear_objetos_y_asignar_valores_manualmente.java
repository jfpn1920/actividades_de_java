package atributos;
class Persona {
    String nombre;
    int edad;
}
public class crear_objetos_y_asignar_valores_manualmente {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        persona2.nombre = "maria";
        persona2.edad = 25;
        System.out.println("persona 1:");
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
        System.out.println();
        System.out.println("persona 2:");
        System.out.println("nombre: " + persona2.nombre);
        System.out.println("edad: " + persona2.edad);
    }
}
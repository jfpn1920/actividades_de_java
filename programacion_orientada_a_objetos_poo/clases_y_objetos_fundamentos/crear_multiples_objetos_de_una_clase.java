package clases_y_objetos_fundamentos;
class Persona {
    String nombre;
    int edad;
}
public class crear_multiples_objetos_de_una_clase {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        persona2.nombre = "maria";
        persona2.edad = 25;
        persona3.nombre = "carlos";
        persona3.edad = 30;
        System.out.println("persona 1: " + persona1.nombre + " - " + persona1.edad);
        System.out.println("persona 2: " + persona2.nombre + " - " + persona2.edad);
        System.out.println("persona 3: " + persona3.nombre + " - " + persona3.edad);
    }
}
package constructores;
class Persona {
    String nombre;
    int edad;
    Persona() {
        this.nombre = "desconocido";
        this.edad = 0;
        System.out.println("se ha creado un objeto persona con constructor vacio.");
    }
    Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        System.out.println("se ha creado un objeto persona con nombre.");
    }
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("se ha creado un objeto persona con nombre y edad.");
    }
}
public class constructor_sobrecargado {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("juan");
        Persona persona3 = new Persona("maria", 25);
        System.out.println("persona 1: " + persona1.nombre + " - " + persona1.edad);
        System.out.println("persona 2: " + persona2.nombre + " - " + persona2.edad);
        System.out.println("persona 3: " + persona3.nombre + " - " + persona3.edad);
    }
}
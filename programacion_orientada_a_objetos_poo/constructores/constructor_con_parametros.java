package constructores;
class Persona {
    String nombre;
    int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;
    }
}
public class constructor_con_parametros {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        Persona persona2 = new Persona("maria", 25);
        System.out.println("persona 1: " + persona1.nombre + " - " + persona1.edad + " años");
        System.out.println("persona 2: " + persona2.nombre + " - " + persona2.edad + " años");
    }
}
package encapsulamiento;
class Persona {
    private String nombre;
    private int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
public class crear_getters {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        System.out.println("nombre: " + persona1.getNombre());
        System.out.println("edad: " + persona1.getEdad());
    }
}
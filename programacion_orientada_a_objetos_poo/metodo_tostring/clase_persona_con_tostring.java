package metodo_tostring;
class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString() {
        return "nombre: " + nombre + ", edad: " + edad;
    }
}
public class clase_persona_con_tostring {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        System.out.println(persona1);
    }
}
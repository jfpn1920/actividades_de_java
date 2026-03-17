package nivel_de_practica;
class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarPersona() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("----------------------");
    }
}
public class clase_principal_mas_clases_modelo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        Persona persona2 = new Persona("maria", 25);
        persona1.mostrarPersona();
        persona2.mostrarPersona();
    }
}
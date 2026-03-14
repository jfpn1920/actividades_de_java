package nivel_de_practica;

public class uso_de_paquetes {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        Persona persona2 = new Persona("maria", 25);
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}
class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("----------------------");
    }
}
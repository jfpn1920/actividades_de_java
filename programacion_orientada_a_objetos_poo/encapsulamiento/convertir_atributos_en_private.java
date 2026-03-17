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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
public class convertir_atributos_en_private {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        System.out.println("nombre: " + persona1.getNombre());
        System.out.println("edad: " + persona1.getEdad());
        persona1.setNombre("maria");
        persona1.setEdad(25);
        System.out.println("\n despues de modificar los atributos:");
        System.out.println("nombre: " + persona1.getNombre());
        System.out.println("edad: " + persona1.getEdad());
    }
}
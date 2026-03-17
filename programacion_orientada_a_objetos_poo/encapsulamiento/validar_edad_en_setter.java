package encapsulamiento;
class Persona {
    private String nombre;
    private int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); 
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
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("edad invalida, no se puede asignar un valor menor a 0.");
        }
    }
}
public class validar_edad_en_setter {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 22);
        System.out.println("edad inicial: " + persona1.getEdad());
        persona1.setEdad(25);
        System.out.println("edad modificada: " + persona1.getEdad());
        persona1.setEdad(-5);
        System.out.println("edad despues de intento invalido: " + persona1.getEdad());
    }
}
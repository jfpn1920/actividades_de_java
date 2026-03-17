package palabra_clave_this;
public class usar_this_en_constructor {
    private String nombre;
    private int edad;
    public usar_this_en_constructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
    public static void main(String[] args) {
        usar_this_en_constructor persona = new usar_this_en_constructor("juan", 25);
        persona.mostrarDatos();
    }
}
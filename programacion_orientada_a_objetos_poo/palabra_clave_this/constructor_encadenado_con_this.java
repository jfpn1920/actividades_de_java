package palabra_clave_this;
public class constructor_encadenado_con_this {
    private String nombre;
    private int edad;
    public constructor_encadenado_con_this() {
        this("sin nombre", 0); 
    }
    public constructor_encadenado_con_this(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
    public static void main(String[] args) {
        constructor_encadenado_con_this persona1 = new constructor_encadenado_con_this();
        persona1.mostrarDatos();
        constructor_encadenado_con_this persona2 = new constructor_encadenado_con_this("laura", 30);
        persona2.mostrarDatos();
    }
}
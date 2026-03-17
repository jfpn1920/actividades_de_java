package palabra_clave_this;
public class retornar_this {
    private String nombre;
    private int edad;
    public retornar_this setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public retornar_this setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
    public static void main(String[] args) {
        retornar_this persona = new retornar_this();
        persona.setNombre("sofia").setEdad(27);
        persona.mostrarDatos();
    }
}
package palabra_clave_this;
public class proyecto_pequeño_usando_this {
    private String nombre;
    private int edad;
    private String ciudad;
    public proyecto_pequeño_usando_this(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + this.nombre);
        System.out.println("edad: " + this.edad);
        System.out.println("ciudad: " + this.ciudad);
    }
    public static void main(String[] args) {
        proyecto_pequeño_usando_this persona =
                new proyecto_pequeño_usando_this("luis", 28, "cartagena");
        persona.mostrarDatos();
        System.out.println("\n actualizando datos...\n");
        persona.setNombre("luis fernando");
        persona.setEdad(29);
        persona.setCiudad("bogota");
        persona.mostrarDatos();
    }
}
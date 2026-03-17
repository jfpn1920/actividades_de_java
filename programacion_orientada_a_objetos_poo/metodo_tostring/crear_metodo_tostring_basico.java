package metodo_tostring;
public class crear_metodo_tostring_basico {
    private String nombre;
    private int edad;
    public crear_metodo_tostring_basico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + ", edad: " + edad;
    }
    public static void main(String[] args) {
        crear_metodo_tostring_basico persona =
                new crear_metodo_tostring_basico("carlos", 25);
        System.out.println(persona);
    }
}
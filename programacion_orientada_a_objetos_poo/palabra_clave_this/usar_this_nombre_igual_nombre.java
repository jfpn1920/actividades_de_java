package palabra_clave_this;
public class usar_this_nombre_igual_nombre {
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre() {
        System.out.println("nombre: " + nombre);
    }
    public static void main(String[] args) {
        usar_this_nombre_igual_nombre persona = new usar_this_nombre_igual_nombre();
        persona.setNombre("laura");
        persona.mostrarNombre();
    }
}
package palabra_clave_this;
public class ejemplo_sin_this_mostrar_error_logico {
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre() {
        System.out.println("nombre: " + nombre);
    }
    public static void main(String[] args) {
        ejemplo_sin_this_mostrar_error_logico persona = new ejemplo_sin_this_mostrar_error_logico();
        persona.setNombre("ana");
        persona.mostrarNombre();
    }
}
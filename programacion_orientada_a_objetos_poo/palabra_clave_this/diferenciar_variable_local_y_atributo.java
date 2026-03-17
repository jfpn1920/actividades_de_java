package palabra_clave_this;
public class diferenciar_variable_local_y_atributo {
    private String nombre;
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre() {
        System.out.println("nombre: " + nombre);
    }
    public static void main(String[] args) {
        diferenciar_variable_local_y_atributo persona = new diferenciar_variable_local_y_atributo();
        persona.asignarNombre("carlos");
        persona.mostrarNombre();
    }
}
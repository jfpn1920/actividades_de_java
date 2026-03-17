package palabra_clave_this;
public class usar_this_en_metodo {
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre() {
        System.out.println("nombre del objeto: " + this.nombre);
    }
    public static void main(String[] args) {
        usar_this_en_metodo persona = new usar_this_en_metodo();
        persona.setNombre("miguel");
        persona.mostrarNombre();
    }
}
package el_uso_del_getters_y_setters;
public class crear_getter_para_nombre {
    private String nombre = "juan";
    public String getNombre() {
        return nombre;
    }
    public static void main(String[] args) {
        crear_getter_para_nombre persona = new crear_getter_para_nombre();
        System.out.println("nombre: " + persona.getNombre());
    }
}
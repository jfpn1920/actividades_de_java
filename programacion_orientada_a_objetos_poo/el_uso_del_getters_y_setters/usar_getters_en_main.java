package el_uso_del_getters_y_setters;
public class usar_getters_en_main {
    private String nombre = "maria";
    private int edad = 22;
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public static void main(String[] args) {
        usar_getters_en_main persona = new usar_getters_en_main();
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
    }
}
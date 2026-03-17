package el_uso_del_getters_y_setters;
public class usar_setters_en_main {
    private String nombre;
    private int edad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public static void main(String[] args) {
        usar_setters_en_main persona = new usar_setters_en_main();
        persona.setNombre("carlos");
        persona.setEdad(30);
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
    }
}
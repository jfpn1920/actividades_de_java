package el_uso_del_getters_y_setters;
public class mostrar_datos_con_getters {
    private String nombre;
    private int edad;
    private String ciudad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCiudad() {
        return ciudad;
    }
    public static void main(String[] args) {
        mostrar_datos_con_getters persona = new mostrar_datos_con_getters();
        persona.setNombre("luis");
        persona.setEdad(35);
        persona.setCiudad("cartagena");
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
        System.out.println("ciudad: " + persona.getCiudad());
    }
}
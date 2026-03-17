package acceso_a_modicar;
public class clase_con_atributos_privados {
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
        clase_con_atributos_privados persona = new clase_con_atributos_privados();
        persona.setNombre("juan");
        persona.setEdad(25);
        persona.setCiudad("cartagena");
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
        System.out.println("ciudad: " + persona.getCiudad());
    }
}
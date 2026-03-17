package acceso_a_modicar;
public class probar_acceso_entre_clases {
    private String nombre;
    private int edad;
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
}
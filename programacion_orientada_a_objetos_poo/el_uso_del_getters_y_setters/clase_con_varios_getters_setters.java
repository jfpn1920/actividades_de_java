package el_uso_del_getters_y_setters;
public class clase_con_varios_getters_setters {
    private String nombre;
    private int edad;
    private double precio;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static void main(String[] args) {
        clase_con_varios_getters_setters obj = new clase_con_varios_getters_setters();
        obj.setNombre("juan");
        obj.setEdad(25);
        obj.setPrecio(199.99);
        System.out.println("nombre: " + obj.getNombre());
        System.out.println("edad: " + obj.getEdad());
        System.out.println("precio: " + obj.getPrecio());
    }
}
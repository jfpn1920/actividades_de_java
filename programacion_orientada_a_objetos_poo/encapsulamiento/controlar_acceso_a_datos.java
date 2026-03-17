package encapsulamiento;
class Usuario {
    private String nombre;
    private String correo;
    Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("nombre invalido.");
        }
    }
    public void setCorreo(String correo) {
        if (correo.contains("@")) {
            this.correo = correo;
        } else {
            System.out.println("correo invalido.");
        }
    }
}
public class controlar_acceso_a_datos {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("juan", "juan@email.com");
        System.out.println("nombre: " + usuario1.getNombre());
        System.out.println("correo: " + usuario1.getCorreo());
        System.out.println();
        usuario1.setNombre("carlos");
        usuario1.setCorreo("carlos@email.com");
        System.out.println("datos actualizados:");
        System.out.println("nombre: " + usuario1.getNombre());
        System.out.println("correo: " + usuario1.getCorreo());
        System.out.println();
        usuario1.setNombre("");
        usuario1.setCorreo("correo_invalido");
    }
}
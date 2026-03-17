package nivel_de_practica;
class Usuario {
    String nombre;
    int edad;
    public Usuario(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("error: el nombre no puede estar vacio.");
            this.nombre = "desconocido";
        } else {
            this.nombre = nombre;
        }
        if (edad < 0 || edad > 120) {
            System.out.println("error: edad no valida.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }
    public void mostrarUsuario() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("-------------------------");
    }
}
public class sistema_con_validaciones_avanzadas {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("juan", 22);
        Usuario usuario2 = new Usuario("", 150); 
        usuario1.mostrarUsuario();
        usuario2.mostrarUsuario();
    }
}
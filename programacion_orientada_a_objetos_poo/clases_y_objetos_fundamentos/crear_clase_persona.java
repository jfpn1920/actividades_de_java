package clases_y_objetos_fundamentos;
class Persona {
    String nombre;
    int edad;
    void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
}
public class crear_clase_persona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        persona1.mostrarInformacion();
    }
}

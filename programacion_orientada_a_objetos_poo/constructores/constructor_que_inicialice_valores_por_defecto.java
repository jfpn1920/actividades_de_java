package constructores;
class Persona {
    String nombre;
    int edad;
    Persona() {
        this.nombre = "sin nombre";
        this.edad = 18;
        System.out.println("se ha creado un objeto persona con valores por defecto.");
    }
}
public class constructor_que_inicialice_valores_por_defecto {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
    }
}
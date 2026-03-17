package clases_y_objetos_fundamentos;
class Persona {
    String nombre;
    int edad;
}
public class mostrar_atributos_directamente_desde_main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.edad = 22;
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
    }
}
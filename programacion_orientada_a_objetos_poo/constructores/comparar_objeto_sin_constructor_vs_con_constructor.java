package constructores;
class PersonaSinConstructor {
    String nombre;
    int edad;
}
class PersonaConConstructor {
    String nombre;
    int edad;
    PersonaConConstructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
public class comparar_objeto_sin_constructor_vs_con_constructor {
    public static void main(String[] args) {
        PersonaSinConstructor persona1 = new PersonaSinConstructor();
        persona1.nombre = "juan";
        persona1.edad = 22;
        System.out.println("objeto sin constructor:");
        System.out.println("nombre: " + persona1.nombre);
        System.out.println("edad: " + persona1.edad);
        System.out.println();
        PersonaConConstructor persona2 = new PersonaConConstructor("maria", 25);
        System.out.println("objeto con constructor:");
        System.out.println("nombre: " + persona2.nombre);
        System.out.println("edad: " + persona2.edad);
    }
}
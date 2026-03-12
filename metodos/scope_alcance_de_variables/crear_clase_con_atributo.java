package scope_alcance_de_variables;
public class crear_clase_con_atributo {
    String nombre;
    public void mostrarNombre() {
        System.out.println("el nombre es: " + nombre);
    }
    public static void main(String[] args) {
        crear_clase_con_atributo persona = new crear_clase_con_atributo();
        persona.nombre = "juan";
        persona.mostrarNombre();
    }
}
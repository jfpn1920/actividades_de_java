package scope_alcance_de_variables;
public class diferencia_entre_atributo_y_variable_local {
    int edad = 25;
    public void mostrarDatos() {
        String nombre = "carlos";
        System.out.println("nombre (variable local): " + nombre);
        System.out.println("edad (atributo): " + edad);
    }
    public static void main(String[] args) {
        diferencia_entre_atributo_y_variable_local persona =
                new diferencia_entre_atributo_y_variable_local();
        persona.mostrarDatos();
    }
}
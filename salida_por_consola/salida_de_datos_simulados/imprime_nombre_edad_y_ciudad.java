package salida_de_datos_simulados;
public class imprime_nombre_edad_y_ciudad {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        String ciudad = "medellin";
        System.out.println("datos personales");
        System.out.println();
        System.out.printf("nombre: %s%n", nombre);
        System.out.printf("edad: %d años%n", edad);
        System.out.printf("ciudad: %s%n", ciudad);
        System.out.println();
        System.out.println("============================");
    }
}
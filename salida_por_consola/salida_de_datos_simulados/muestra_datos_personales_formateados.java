package salida_de_datos_simulados;
public class muestra_datos_personales_formateados {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        String ciudad = "medellin";
        String profesion = "ingeniero";
        System.out.println("datos personales");
        System.out.println();
        System.out.printf("%-12s: %s%n", "Nombre", nombre);
        System.out.printf("%-12s: %d años%n", "Edad", edad);
        System.out.printf("%-12s: %s%n", "Ciudad", ciudad);
        System.out.printf("%-12s: %s%n", "Profesión", profesion);
        System.out.println();
        System.out.println("==============================");
    }
}
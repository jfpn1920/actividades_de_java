package mini_retos_de_salida_por_consola;
public class usa_correctamente_los_tres_metodos {
    public static void main(String[] args) {
        String nombre = "carlos";
        int edad = 25;
        double altura = 1.75;
        System.out.print("nombre: ");
        System.out.print(nombre);
        System.out.println(); 
        System.out.println("edad: " + edad);
        System.out.printf("altura: %.2f metros%n", altura);
        System.out.print("resumen -> ");
        System.out.println(nombre + ", " + edad + " años");
        System.out.printf("altura exacta: %.2f m%n", altura);
    }
}
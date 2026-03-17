package formateo_de_numeros_con_printf;
public class compara_println_vs_printf {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        double precio = 19.99;
        System.out.println("usando println");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("precio: $" + precio);
        System.out.printf("%n usando printf %n");
        System.out.printf("nombre: %s%n", nombre);
        System.out.printf("edad: %d%n", edad);
        System.out.printf("precio: $%.2f%n", precio);
    }
}
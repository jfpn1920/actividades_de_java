package combinando_print_println_y_printf;
public class explica_por_que_elegiste_cada_metodo {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        double promedio = 4.5;
        System.out.println("informacion del estudiante");
        System.out.print("nombre: ");
        System.out.println(nombre); 
        System.out.printf("edad: %d años%n", edad);         
        System.out.printf("promedio: %.2f%n", promedio);    
        System.out.println("======================================");
    }
}
package deteccion_y_correccion_de_errores;
public class mejora_una_salida_defectuosa {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 20;
        double promedio = 4.5;
        System.out.println("datos del estudiante");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("promedio: " + promedio);
        System.out.printf("\n resumen -> nombre: %s | edad: %d | promedio: %.2f\n",
                nombre, edad, promedio);
    }
}
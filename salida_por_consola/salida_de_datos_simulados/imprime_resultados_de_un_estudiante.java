package salida_de_datos_simulados;
public class imprime_resultados_de_un_estudiante {
    public static void main(String[] args) {
        String nombre = "juan";
        double nota1 = 4.5;
        double nota2 = 3.8;
        double nota3 = 4.2;
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("resultados del estudiante");
        System.out.println();
        System.out.printf("nombre: %s%n", nombre);
        System.out.printf("nota 1: %.2f%n", nota1);
        System.out.printf("nota 2: %.2f%n", nota2);
        System.out.printf("nota 3: %.2f%n", nota3);
        System.out.println("-------------------------------------");
        System.out.printf("promedio: %.2f%n", promedio);
        System.out.println();
        System.out.println("=====================================");
    }
}
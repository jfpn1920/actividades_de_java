package tipos_wrapper;
public class ejercicio_practico_con_wrappers {
    public static void main(String[] args) {
        String edadTexto = "23";
        String salarioTexto = "1500.50";
        Integer edad = Integer.valueOf(edadTexto);
        Double salario = Double.valueOf(salarioTexto);
        Double salarioAnual = salario * 12;
        System.out.println("edad: " + edad);
        System.out.println("salario mensual: " + salario);
        System.out.println("salario anual: " + salarioAnual);
    }
}
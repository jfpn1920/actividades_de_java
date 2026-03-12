package metodos_mas_bucles;
public class metodo_que_calcule_promedio_con_while {
    public static double calcularPromedio(int cantidad) {
        int contador = 1;
        int suma = 0;
        while (contador <= cantidad) {
            suma += contador;
            contador++;
        }
        double promedio = (double) suma / cantidad;
        return promedio;
    }
    public static void main(String[] args) {
        double resultado = calcularPromedio(10);
        System.out.println("el promedio de los numeros del 1 al 10 es: " + resultado);
    }
}
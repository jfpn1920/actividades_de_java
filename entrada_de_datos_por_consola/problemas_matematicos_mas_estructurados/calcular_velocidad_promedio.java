package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_velocidad_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distancia;
        double tiempo;
        double velocidad;
        System.out.print("ingrese la distancia recorrida en km: ");
        distancia = entrada.nextDouble();
        System.out.print("ingrese el tiempo empleado en horas: ");
        tiempo = entrada.nextDouble();
        velocidad = distancia / tiempo;
        System.out.println("\nla velocidad promedio es: " + velocidad + " km/h");
        entrada.close();
    }
}
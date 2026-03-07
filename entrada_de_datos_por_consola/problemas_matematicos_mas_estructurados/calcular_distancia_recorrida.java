package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_distancia_recorrida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double velocidad;
        double tiempo;
        double distancia;
        System.out.print("ingrese la velocidad km/h: ");
        velocidad = entrada.nextDouble();
        System.out.print("ingrese el tiempo del recorrido horas: ");
        tiempo = entrada.nextDouble();
        distancia = velocidad * tiempo;
        System.out.println("\nla distancia recorrida es: " + distancia + " km");
        entrada.close();
    }
}
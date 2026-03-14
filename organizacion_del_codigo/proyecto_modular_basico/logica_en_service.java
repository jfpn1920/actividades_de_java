package proyecto_modular_basico;
public class logica_en_service {
    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 5;
        int resultado = CalculadoraService.sumar(numeroUno, numeroDos);
        System.out.println("el resultado de la suma es: " + resultado);
    }
}
class CalculadoraService {
    public static int sumar(int a, int b) {
        return a + b;
    }

}
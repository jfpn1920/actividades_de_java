package metodos_con_return;
public class metodo_que_retorne_potencia {
    public static double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    public static void main(String[] args) {
        double pot1 = calcularPotencia(2, 3); 
        double pot2 = calcularPotencia(5, 4); 
        System.out.println("2 elevado a 3 = " + pot1);
        System.out.println("5 elevado a 4 = " + pot2);
    }
}
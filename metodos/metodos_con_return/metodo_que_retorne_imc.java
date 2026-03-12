package metodos_con_return;
public class metodo_que_retorne_imc {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static void main(String[] args) {
        double imc1 = calcularIMC(70, 1.75); 
        double imc2 = calcularIMC(60, 1.60); 
        System.out.println("IMC de 70kg y 1.75m: " + imc1);
        System.out.println("IMC de 60kg y 1.60m: " + imc2);
    }
}
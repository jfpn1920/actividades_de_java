package nivel_de_practica;
class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int restar(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("no se puede dividir entre cero.");
            return 0;
        }
    }
}
public class separar_logica_en_diferentes_clases {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int suma = calc.sumar(10, 5);
        int resta = calc.restar(10, 5);
        int multiplicacion = calc.multiplicar(10, 5);
        int division = calc.dividir(10, 5);
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
    }
}
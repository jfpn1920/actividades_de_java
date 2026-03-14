package convenciones_de_nombres;
public class refactorizar_nombres_mal_escritos {
    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 20;
        calcularSuma(numeroUno, numeroDos);
    }
    public static void calcularSuma(int primerNumero, int segundoNumero) {
        int resultadoSuma = primerNumero + segundoNumero;
        System.out.println("el resultado de la suma es: " + resultadoSuma);
    }
}
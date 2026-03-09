package recorrer_arrays_con_for;
public class buscar_valor_especifico {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valorBuscado = 30;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("el valor " + valorBuscado + " se encuentra en el arreglo.");
        } else {
            System.out.println("el valor " + valorBuscado + " no se encuentra en el arreglo.");
        }
    }
}
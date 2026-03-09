package foreach_enhanced_for;
public class comparar_for_vs_foreach {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("recorrido usando for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

//package foreach_enhanced_for;
//public class comparar_for_vs_foreach {
//    public static void main(String[] args) {
//        int[] numeros = {10, 20, 30, 40, 50};
//        System.out.println("recorrido usando foreach:");
//        for (int numero : numeros) {
//            System.out.println(numero);
//        }
//    }
//}
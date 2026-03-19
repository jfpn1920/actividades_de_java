package identificacion_y_correccion_de_errores;
public class explica_por_que_el_error_ocurria {
    public static void main(String[] args) {
        // Error original:
        // System.out.println("Hola mundo")  <-- ❌ Faltaba el punto y coma
        // int suma = numero + 5;          <-- ❌ "numero" no estaba declarado
        // Explicación de los errores:
        // 1️⃣ Faltaba el punto y coma
        // En Java, cada instrucción debe terminar con ';'
        // Si se omite, el compilador no puede entender dónde termina la instrucción,
        // y el programa no compila.
        // 2️⃣ Uso de variable no declarada
        // Se intentó usar 'numero' antes de declararla.
        // Todas las variables deben ser declaradas antes de ser utilizadas.
        // De lo contrario, el compilador lanza un error de "cannot find symbol".
        // Programa corregido:
        int numero = 10;             // ✔ Declarada antes de usar
        int suma = numero + 5;       // ✔ Ahora funciona
        System.out.println("hola mundo");   // ✔ Punto y coma agregado
        System.out.println("la suma es: " + suma);
    }
}
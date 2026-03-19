package palabra_clave_static;
public class identifica_errores_comunes_relacionados_con_static {
    public static void main(String[] args) {
        metodoNoEstatico(); // ❌ Error: no se puede llamar un método no static desde static
        System.out.println(numero); // ❌ Error: variable no static usada en contexto static
    }
    static int numero = 10; // ❌ No es static
    public static void metodoNoEstatico() { // ❌ No es static
        System.out.println("Método no static");
    }
    public static void metodoConError() { // ❌ Error: 'static' mal escrito
        System.out.println("Error de escritura");
    }
}
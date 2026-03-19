package palabra_clave_static;
public class explica_con_comentarios_por_que_main_debe_ser_static {
    // El método main debe ser static porque Java lo ejecuta al iniciar el programa
    // sin crear un objeto de la clase.
    // Al ser static, pertenece a la clase y puede ejecutarse directamente.
    // Si no fuera static, Java necesitaría crear un objeto primero,
    // pero no sabe cómo hacerlo automáticamente al inicio.
    public static void main(String[] args) {
        System.out.println("el metodo main es static por una razon importante");
    }
}
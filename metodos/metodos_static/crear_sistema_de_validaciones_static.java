package metodos_static;
public class crear_sistema_de_validaciones_static {
    public static boolean validarEdad(int edad) {
        return edad >= 18;
    }
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }
    public static boolean validarCorreo(String correo) {
        return correo.contains("@");
    }
    public static void main(String[] args) {
        int edad = 20;
        int numero = -5;
        String correo = "juan@example.com";
        System.out.println("edad " + edad + " es mayor de edad? " + validarEdad(edad));
        System.out.println("numero " + numero + " es positivo? " + esPositivo(numero));
        System.out.println("correo '" + correo + "' es válido? " + validarCorreo(correo));
    }
}
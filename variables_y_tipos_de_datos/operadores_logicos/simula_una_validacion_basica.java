package operadores_logicos;
public class simula_una_validacion_basica {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";
        String usuarioIngresado = "admin";
        String contrasenaIngresada = "1234";
        boolean accesoPermitido = 
                usuarioIngresado.equals(usuarioCorrecto) &&
                contrasenaIngresada.equals(contrasenaCorrecta);
        if (accesoPermitido) {
            System.out.println("acceso concedido.");
        } else {
            System.out.println("acceso denegado.");
        }
    }
}
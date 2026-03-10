package integracion_total;
import java.util.Scanner;
public class login_con_intentos_y_excepciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";
        int intentos = 3;
        boolean acceso = false;
        while (intentos > 0 && !acceso) {
            try {
                System.out.print("ingrese usuario: ");
                String usuario = entrada.nextLine();
                System.out.print("ingrese contraseña: ");
                String clave = entrada.nextLine();
                if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
                    acceso = true;
                    System.out.println("acceso concedido, bienvenido al sistema.");
                } else {
                    intentos--;
                    System.out.println("usuario o contraseña incorrectos.");
                    System.out.println("intentos restantes: " + intentos);
                }
            } catch (Exception e) {
                System.out.println("error en la entrada de datos.");
                entrada.nextLine();
            }
        }
        if (!acceso) {
            System.out.println("cuenta bloqueada, ha superado el numero de intentos.");
        }
        entrada.close();
    }
}
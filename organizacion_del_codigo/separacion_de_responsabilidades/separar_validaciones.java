package separacion_de_responsabilidades;
public class separar_validaciones {
    public static void main(String[] args) {
        int edadUsuario = 20;
        if (esEdadValida(edadUsuario)) {
            System.out.println("la edad es valida.");
        } else {
            System.out.println("la edad no es valida.");
        }
    }
    public static boolean esEdadValida(int edad) {
        if (edad >= 0 && edad <= 120) {
            return true;
        } else {
            return false;
        }
    }
}
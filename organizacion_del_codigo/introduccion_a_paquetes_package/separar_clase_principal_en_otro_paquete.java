package introduccion_a_paquetes_package;
public class separar_clase_principal_en_otro_paquete {
    static class Usuario {
        public void mostrar() {
            System.out.println("clase usuario dentro del mismo archivo.");
        }
    }
    public static void main(String[] args) {
        System.out.println("clase principal dentro de un solo archivo.");
        Usuario miUsuario = new Usuario();
        miUsuario.mostrar();
    }
}
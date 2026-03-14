package introduccion_a_paquetes_package;
public class probar_ejecucion_completa_desde_terminal {
    public static void main(String[] args) {
        System.out.println("programa ejecutado correctamente desde la terminal.");
        System.out.println("probando el uso de paquetes en java.");
        Mensaje m = new Mensaje();
        m.mostrarMensaje();
    }
}
class Mensaje {
    public void mostrarMensaje() {
        System.out.println("este mensaje viene de otra clase dentro del mismo paquete.");
    }

}
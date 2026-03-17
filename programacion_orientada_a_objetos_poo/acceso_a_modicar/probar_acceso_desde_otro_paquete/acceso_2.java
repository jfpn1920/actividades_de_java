package acceso_a_modicar.probar_acceso_desde_otro_paquete;
public class acceso_2 {
    public static void main(String[] args) {
        acceso_1 obj = new acceso_1();
        System.out.println(obj.mensaje);
        obj.mostrarMensaje();
    }
}
package acceso_a_modicar;
public class metodo_publico {
    public void saludar() {
        System.out.println("hola, este es un metodo publico.");
    }
    public static void main(String[] args) {
        metodo_publico obj = new metodo_publico();
        obj.saludar();
    }
}
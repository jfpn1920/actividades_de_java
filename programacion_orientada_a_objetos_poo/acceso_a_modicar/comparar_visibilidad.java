package acceso_a_modicar;
public class comparar_visibilidad {
    public void metodoPublico() {
        System.out.println("este es un metodo publico.");
    }
    private void metodoPrivado() {
        System.out.println("este es un metodo privado.");
    }
    void metodoDefault() {
        System.out.println("este es un metodo default.");
    }
    public static void main(String[] args) {
        comparar_visibilidad obj = new comparar_visibilidad();
        obj.metodoPublico();
        obj.metodoPrivado();
        obj.metodoDefault();
    }
}
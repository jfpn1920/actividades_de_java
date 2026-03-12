package metodos_static;
public class comparar_metodo_static_vs_no_static {
    public static void metodoStatic() {
        System.out.println("este es un metodo static.");
    }
    public void metodoNoStatic() {
        System.out.println("Este es un metodo no static.");
    }
    public static void main(String[] args) {
        metodoStatic();
        comparar_metodo_static_vs_no_static obj = new comparar_metodo_static_vs_no_static();
        obj.metodoNoStatic();
    }
}
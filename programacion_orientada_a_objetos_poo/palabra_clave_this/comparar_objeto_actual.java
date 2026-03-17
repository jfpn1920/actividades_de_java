package palabra_clave_this;
public class comparar_objeto_actual {
    private String nombre;
    public comparar_objeto_actual(String nombre) {
        this.nombre = nombre;
    }
    public boolean esIgual(comparar_objeto_actual otroObjeto) {
        return this.nombre.equals(otroObjeto.nombre);
    }
    public static void main(String[] args) {
        comparar_objeto_actual obj1 = new comparar_objeto_actual("carlos");
        comparar_objeto_actual obj2 = new comparar_objeto_actual("carlos");
        comparar_objeto_actual obj3 = new comparar_objeto_actual("ana");
        System.out.println("obj1 y obj2 son iguales: " + obj1.esIgual(obj2));
        System.out.println("obj1 y obj3 son iguales: " + obj1.esIgual(obj3));
    }
}
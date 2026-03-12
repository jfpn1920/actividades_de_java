package metodos_con_parametros;
public class metodo_que_reciba_un_nombre_y_lo_imprima {
    public static void imprimirNombre(String nombre) {
        System.out.println("el nombre es: " + nombre);
    }
    public static void main(String[] args) {
        imprimirNombre("juan felipe");
    }
}
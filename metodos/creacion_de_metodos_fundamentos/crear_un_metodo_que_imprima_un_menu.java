package creacion_de_metodos_fundamentos;
public class crear_un_metodo_que_imprima_un_menu {
    public static void mostrarMenu() {
        System.out.println("menu principal");
        System.out.println("1. ver perfil");
        System.out.println("2. editar perfil");
        System.out.println("3. configuracion");
        System.out.println("4. salir");
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        mostrarMenu();
    }
}
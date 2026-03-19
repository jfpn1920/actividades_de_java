package metodo_main;
public class crea_un_programa_con_dos_metodos_main_y_analiza_que_pasa {
    public static void main(String[] args) {
        System.out.println("este es el main principal");
    }
    public static void main(int numero) {
        System.out.println("este es otro main con parametro int: " + numero);
    }
}
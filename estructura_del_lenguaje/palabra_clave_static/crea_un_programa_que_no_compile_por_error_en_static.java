package palabra_clave_static;
public class crea_un_programa_que_no_compile_por_error_en_static {
    public void main(String[] args) {
        System.out.println("main no es static");
        metodoEstatico();
    }
    public static void metodoEstatico() {
        System.out.println("soy un metodo static");
    }
}
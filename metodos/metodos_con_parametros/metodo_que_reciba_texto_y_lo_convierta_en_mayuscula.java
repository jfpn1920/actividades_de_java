package metodos_con_parametros;
public class metodo_que_reciba_texto_y_lo_convierta_en_mayuscula {
    public static void convertirAMayusculas(String texto) {
        String textoMayusculas = texto.toUpperCase();
        System.out.println("texto original: " + texto);
        System.out.println("texto en mayusculas: " + textoMayusculas);
    }
    public static void main(String[] args) {
        convertirAMayusculas("hola mundo");
        convertirAMayusculas("java es divertido");
    }
}
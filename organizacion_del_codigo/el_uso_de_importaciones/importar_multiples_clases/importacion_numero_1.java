package el_uso_de_importaciones.importar_multiples_clases;
public class importacion_numero_1 {
    public static void main(String[] args) {
        importacion_numero_2 objeto1 = new importacion_numero_2();
        importacion_numero_3 objeto2 = new importacion_numero_3();
        objeto1.mensaje1();
        objeto2.mensaje2();
    }
}
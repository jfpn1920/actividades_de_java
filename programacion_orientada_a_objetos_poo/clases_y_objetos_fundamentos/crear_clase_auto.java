package clases_y_objetos_fundamentos;
class Auto {
    String marca;
    String modelo;
    int anio;
}
public class crear_clase_auto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.marca = "toyota";
        auto1.modelo = "corolla";
        auto1.anio = 2022;
        System.out.println("marca: " + auto1.marca);
        System.out.println("modelo: " + auto1.modelo);
        System.out.println("año: " + auto1.anio);
    }
}
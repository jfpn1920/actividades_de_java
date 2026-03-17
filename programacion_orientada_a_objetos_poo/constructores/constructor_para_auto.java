package constructores;
class Auto {
    String marca;
    String modelo;
    int anio;
    Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        System.out.println("se ha creado un objeto auto con constructor.");
    }
}
public class constructor_para_auto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("toyota", "corolla", 2023);
        Auto auto2 = new Auto("honda", "civic", 2022);
        System.out.println("auto 1: " + auto1.marca + " " + auto1.modelo + " - " + auto1.anio);
        System.out.println("auto 2: " + auto2.marca + " " + auto2.modelo + " - " + auto2.anio);
    }
}
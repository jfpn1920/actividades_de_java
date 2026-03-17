package metodo_tostring;
class Auto {
    String marca;
    String modelo;
    int año;
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    @Override
    public String toString() {
        return "marca: " + marca + ", modelo: " + modelo + ", año: " + año;
    }
}
public class clase_auto_con_tostring {
    public static void main(String[] args) {
        Auto auto1 = new Auto("toyota", "corolla", 2022);
        System.out.println(auto1);
    }
}
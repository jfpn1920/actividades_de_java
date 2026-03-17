package atributos;
class Computador {
    int ram;
}
public class clase_computador_con_ram {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.ram = 16;
        System.out.println("memoria ram: " + computador1.ram + " gb");
    }
}
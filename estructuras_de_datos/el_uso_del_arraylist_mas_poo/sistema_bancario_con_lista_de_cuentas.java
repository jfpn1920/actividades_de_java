package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class sistema_bancario_con_lista_de_cuentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        System.out.print("¿cuantas cuentas desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n registro de cuenta " + (i + 1));
            System.out.print("nombre del titular: ");
            String titular = sc.nextLine();
            System.out.print("saldo inicial: ");
            double saldo = sc.nextDouble();
            sc.nextLine();
            cuentas.add(new Cuenta(titular, saldo));
        }
        System.out.println("\n lista de cuentas bancarias ");
        System.out.println("--------------------------");
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
        sc.close();
    }
}
class Cuenta {
    String titular;
    double saldo;
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "titular: " + titular + " | saldo: $" + saldo;
    }
}
package scope_alcance_de_variables;
public class variable_dentro_de_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("valor de i dentro del for: " + i);
            int doble = i * 2;
            System.out.println("el doble es: " + doble);
        }
    }
}
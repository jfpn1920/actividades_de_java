package introduccion_a_paquetes_package;
public class crear_multiples_clases_en_diferentes_paquetes {
    public static void main(String[] args) {
        Saludo s = new Saludo();
        s.mostrarSaludo();
        Operacion op = new Operacion();
        op.mostrarSuma();
    }
}
class Saludo {
    public void mostrarSaludo() {
        System.out.println("hola, este mensaje viene de la clase saludo.");
    }
}
class Operacion {
    public void mostrarSuma() {
        int a = 5;
        int b = 3;
        int resultado = a + b;
        System.out.println("la suma es: " + resultado);
    }
}
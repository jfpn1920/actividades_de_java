package estructura_profesional_en_consola;
public class separar_logica_de_presentacion {
    public static void main(String[] args) {
        LogicaPrograma logica = new LogicaPrograma();
        PresentacionConsola vista = new PresentacionConsola();
        int resultado = logica.sumar(5, 3);
        vista.mostrarResultado(resultado);
    }
}
class LogicaPrograma {
    public int sumar(int a, int b) {
        return a + b;
    }
}
class PresentacionConsola {
    public void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}
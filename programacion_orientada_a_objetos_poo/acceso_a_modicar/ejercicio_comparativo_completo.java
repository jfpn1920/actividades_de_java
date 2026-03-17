package acceso_a_modicar;
public class ejercicio_comparativo_completo {
    public void metodoPublico() {
        System.out.println("metodo publico: accesible desde cualquier lugar.");
    }
    private void metodoPrivado() {
        System.out.println("metodo privado: solo dentro de esta clase.");
    }
    protected void metodoProtegido() {
        System.out.println("metodo protegido: accesible en el mismo paquete o por herencia.");
    }
    void metodoDefault() {
        System.out.println("metodo default: accesible solo dentro del mismo paquete.");
    }
    public static void main(String[] args) {
        ejercicio_comparativo_completo obj = new ejercicio_comparativo_completo();
        obj.metodoPublico();
        obj.metodoPrivado();
        obj.metodoProtegido();
        obj.metodoDefault();
    }
}
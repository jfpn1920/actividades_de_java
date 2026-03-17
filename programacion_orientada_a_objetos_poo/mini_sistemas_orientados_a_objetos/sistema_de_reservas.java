package mini_sistemas_orientados_a_objetos;
class Reserva {
    String cliente;
    String lugar;
    int personas;
    public Reserva(String cliente, String lugar, int personas) {
        this.cliente = cliente;
        this.lugar = lugar;
        this.personas = personas;
    }
    public void mostrarReserva() {
        System.out.println("cliente: " + cliente);
        System.out.println("lugar reservado: " + lugar);
        System.out.println("numero de personas: " + personas);
        System.out.println("---------------------------");
    }
}
public class sistema_de_reservas {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("juan", "  mesa 5", 4);
        Reserva reserva2 = new Reserva("maria", " mesa 2", 2);
        Reserva reserva3 = new Reserva("carlos", "mesa 8", 6);
        reserva1.mostrarReserva();
        reserva2.mostrarReserva();
        reserva3.mostrarReserva();
    }
}
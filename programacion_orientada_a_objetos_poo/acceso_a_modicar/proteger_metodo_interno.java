package acceso_a_modicar;
public class proteger_metodo_interno {
    private void procesoInterno() {
        System.out.println("este es un proceso interno protegido.");
    }
    public void ejecutarProceso() {
        System.out.println("iniciando proceso...");
        procesoInterno();
        System.out.println("proceso finalizado.");
    }
    public static void main(String[] args) {
        proteger_metodo_interno obj = new proteger_metodo_interno();
        obj.ejecutarProceso();
    }
}
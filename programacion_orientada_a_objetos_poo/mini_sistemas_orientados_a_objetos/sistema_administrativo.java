package mini_sistemas_orientados_a_objetos;
class Administrativo {
    String nombre;
    String departamento;
    String puesto;
    public Administrativo(String nombre, String departamento, String puesto) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("departamento: " + departamento);
        System.out.println("puesto: " + puesto);
        System.out.println("---------------------------");
    }
}
public class sistema_administrativo {
    public static void main(String[] args) {
        Administrativo admin1 = new Administrativo("juan", "finanzas", "contador");
        Administrativo admin2 = new Administrativo("maría", "recursos humanos", "analista");
        Administrativo admin3 = new Administrativo("carlos", "sistemas", "administrador de red");
        admin1.mostrarInformacion();
        admin2.mostrarInformacion();
        admin3.mostrarInformacion();
    }
}
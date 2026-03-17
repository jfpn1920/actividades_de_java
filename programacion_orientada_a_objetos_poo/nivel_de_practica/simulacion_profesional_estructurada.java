package nivel_de_practica;
class Empleado {
    String nombre;
    String cargo;
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public void mostrarEmpleado() {
        System.out.println("empleado: " + nombre);
        System.out.println("cargo: " + cargo);
    }
}
class Proyecto {
    String nombreProyecto;
    Empleado responsable;
    public Proyecto(String nombreProyecto, Empleado responsable) {
        this.nombreProyecto = nombreProyecto;
        this.responsable = responsable;
    }
    public void mostrarProyecto() {
        System.out.println("proyecto: " + nombreProyecto);
        responsable.mostrarEmpleado();
    }
}
class Tarea {
    String descripcion;
    boolean completada;
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }
    public void completarTarea() {
        completada = true;
    }
    public void mostrarTarea() {
        System.out.println("tarea: " + descripcion);
        System.out.println("estado: " + (completada ? "completada" : "pendiente"));
    }
}
public class simulacion_profesional_estructurada {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", "desarrollador");
        Proyecto proyecto1 = new Proyecto("sistema de gestion", empleado1);
        Tarea tarea1 = new Tarea("diseñar base de datos");
        Tarea tarea2 = new Tarea("desarrollar interfaz");
        tarea1.completarTarea();
        System.out.println("simulacion profesional");
        proyecto1.mostrarProyecto();
        System.out.println("------------------------");
        tarea1.mostrarTarea();
        System.out.println("------------------------");
        tarea2.mostrarTarea();
    }
}
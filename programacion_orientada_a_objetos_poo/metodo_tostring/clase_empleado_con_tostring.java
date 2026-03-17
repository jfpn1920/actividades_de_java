package metodo_tostring;
class Empleado {
    String nombre;
    String cargo;
    double salario;
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + ", cargo: " + cargo + ", salario: $" + salario;
    }
}
public class clase_empleado_con_tostring {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("carlos", "administrador", 2500.50);
        System.out.println(empleado1);
    }
}
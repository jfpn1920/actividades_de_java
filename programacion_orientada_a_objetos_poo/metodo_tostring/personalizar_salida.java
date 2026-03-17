package metodo_tostring;
public class personalizar_salida {
    private String nombre;
    private String cargo;
    private double salario;
    public personalizar_salida(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return " informacion del empleado \n"
                + "nombre : " + nombre + "\n"
                + "cargo  : " + cargo + "\n"
                + "salario: $" + salario + "\n"
                + "------------------------------------";
    }
    public static void main(String[] args) {
        personalizar_salida empleado =
                new personalizar_salida("laura", "administradora", 3500);
        System.out.println(empleado);
    }
}
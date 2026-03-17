package encapsulamiento;
class Empleado {
    private String nombre;
    private double salario;
    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); 
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("error: el salario no puede ser negativo.");
        }
    }
}
public class proteger_atributo_salario {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("carlos", 2000);
        System.out.println("empleado: " + empleado1.getNombre());
        System.out.println("salario: " + empleado1.getSalario());
        empleado1.setSalario(2500);
        System.out.println("nuevo salario: " + empleado1.getSalario());
        empleado1.setSalario(-500);
        System.out.println("salario despues del intento invalido: " + empleado1.getSalario());
    }
}
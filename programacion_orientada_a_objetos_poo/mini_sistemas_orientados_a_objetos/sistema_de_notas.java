package mini_sistemas_orientados_a_objetos;
class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public void mostrarNotas() {
        System.out.println("estudiante: " + nombre);
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("nota 3: " + nota3);
        System.out.println("promedio: " + calcularPromedio());
        System.out.println("---------------------------");
    }
}
public class sistema_de_notas {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("juan", 4.5, 3.8, 4.2);
        Estudiante estudiante2 = new Estudiante("maría", 4.9, 4.7, 4.8);
        estudiante1.mostrarNotas();
        estudiante2.mostrarNotas();
    }
}
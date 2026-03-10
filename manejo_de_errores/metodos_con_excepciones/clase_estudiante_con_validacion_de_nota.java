package metodos_con_excepciones;
import java.util.Scanner;
class Estudiante {
    private double nota;
    public Estudiante(double notaInicial) throws IllegalArgumentException {
        validarNota(notaInicial);
        this.nota = notaInicial;
    }
    public void setNota(double nota) throws IllegalArgumentException {
        validarNota(nota);
        this.nota = nota;
    }
    private void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 5) {
            throw new IllegalArgumentException("error: la nota debe estar entre 0 y 5.");
        }
    }
    public double getNota() {
        return nota;
    }
}
public class clase_estudiante_con_validacion_de_nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese la nota inicial del estudiante del 0 al 5: ");
            double notaInicial = scanner.nextDouble();
            Estudiante estudiante = new Estudiante(notaInicial);
            System.out.print("ingrese la nueva nota del estudiante del 0 al 5: ");
            double nuevaNota = scanner.nextDouble();
            estudiante.setNota(nuevaNota);
            System.out.println("nota final del estudiante: " + estudiante.getNota());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
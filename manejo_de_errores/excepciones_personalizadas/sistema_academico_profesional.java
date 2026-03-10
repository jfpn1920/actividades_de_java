package excepciones_personalizadas;
import java.util.Scanner;
class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
class Estudiante {
    private String nombre;
    private double nota;
    public Estudiante(String nombre, double nota) throws NotaInvalidaException {
        this.nombre = nombre;
        setNota(nota); 
    }
    public void setNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 5) {
            throw new NotaInvalidaException("nota invalida para " + nombre + ": debe estar entre 0 y 5.");
        }
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
    public String getNombre() {
        return nombre;
    }
}
public class sistema_academico_profesional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese nombre del estudiante: ");
            String nombre = scanner.nextLine();
            System.out.print("ingrese la nota del estudiante del 0 al 5: ");
            double nota = scanner.nextDouble();
            Estudiante estudiante = new Estudiante(nombre, nota);
            System.out.println("estudiante registrado: " + estudiante.getNombre() + " con nota: " + estudiante.getNota());
        } catch (NotaInvalidaException e) {
            System.out.println("excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
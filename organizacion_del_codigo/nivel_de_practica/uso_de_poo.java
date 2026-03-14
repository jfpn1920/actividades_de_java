package nivel_de_practica;
public class uso_de_poo {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("juan", 20);
        Estudiante estudiante2 = new Estudiante("maria", 22);
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
class Estudiante {
    private String nombre;
    private int edad;
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("-------------------");
    }
}
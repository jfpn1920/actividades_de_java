package mini_sistemas_orientados_a_objetos;
class Libro {
    String titulo;
    String autor;
    int año;
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    public void mostrarLibro() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("año de publicacion: " + año);
        System.out.println("---------------------------");
    }
}
public class sistema_de_biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("cien años de soledad", "gabriel garcia marquez", 1967);
        Libro libro2 = new Libro("don quijote de la mancha", "miguel de cervantes", 1605);
        Libro libro3 = new Libro("la odisea", "homero", -700);
        libro1.mostrarLibro();
        libro2.mostrarLibro();
        libro3.mostrarLibro();
    }
}
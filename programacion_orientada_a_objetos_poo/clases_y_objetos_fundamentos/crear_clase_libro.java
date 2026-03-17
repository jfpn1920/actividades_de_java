package clases_y_objetos_fundamentos;
class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
}
public class crear_clase_libro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "cien años de soledad";
        libro1.autor = "gabriel garcia marquez";
        libro1.anioPublicacion = 1967;
        System.out.println("titulo: " + libro1.titulo);
        System.out.println("autor: " + libro1.autor);
        System.out.println("año de publicacion: " + libro1.anioPublicacion);
    }
}
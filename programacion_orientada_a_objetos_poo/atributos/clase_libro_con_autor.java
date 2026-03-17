package atributos;
class Libro {
    String autor;
}
public class clase_libro_con_autor {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.autor = "gabriel garcia marquez";
        System.out.println("autor del libro: " + libro1.autor);
    }
}
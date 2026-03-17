package atributos;
class Pelicula {
    int duracion;
}
public class clase_pelicula_con_duracion {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.duracion = 120;
        System.out.println("duracion de la pelicula: " + pelicula1.duracion + " minutos");
    }
}
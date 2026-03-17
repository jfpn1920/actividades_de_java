package mini_retos_de_salida_por_consola;
public class crea_un_programa_de_presentacion_personal {
    public static void main(String[] args) {
        String nombre = "genis";
        int edad = 20;
        String ciudad = "medellin";
        String profesion = "estudiante de programacion";
        System.out.println("presentacion personal");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad + " años");
        System.out.println("ciudad: " + ciudad);
        System.out.println("profesion: " + profesion);
        System.out.println("\n hola, Mi nombre es " + nombre + 
            ", tengo " + edad + 
            " años y vivo en " + ciudad + ".");
    }
}
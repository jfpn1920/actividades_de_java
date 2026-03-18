package mini_retos_de_variables_y_datos;
public class crea_un_programa_que_muestre_datos_personales {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 20;
        double estatura = 1.75;
        char genero = 'M';
        boolean estudiante = true;
        System.out.println("datos personales:");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + " metros");
        System.out.println("genero: " + genero);
        System.out.println("¿es estudiante?: " + estudiante);
    }
}
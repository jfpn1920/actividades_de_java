package tipo_de_dato_string;
public class muestra_una_frase_completa_usando_variables {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 18;
        String ciudad = "medellin";
        String frase = "mi nombre es " + nombre + ", tengo " + edad + " años y vivo en " + ciudad + ".";
        System.out.println(frase);
    }
}
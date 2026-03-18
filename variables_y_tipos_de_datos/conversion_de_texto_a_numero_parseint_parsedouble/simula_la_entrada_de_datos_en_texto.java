package conversion_de_texto_a_numero_parseint_parsedouble;
public class simula_la_entrada_de_datos_en_texto {
    public static void main(String[] args) {
        String entradaEdad = "18";
        String entradaEstatura = "1.75";
        int edad = Integer.parseInt(entradaEdad);
        double estatura = Double.parseDouble(entradaEstatura);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura);
        int edadEn5Anios = edad + 5;
        System.out.println("edad en 5 años: " + edadEn5Anios);
    }
}
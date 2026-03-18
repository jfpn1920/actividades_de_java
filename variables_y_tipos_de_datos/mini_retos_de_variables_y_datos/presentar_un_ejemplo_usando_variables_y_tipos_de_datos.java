package mini_retos_de_variables_y_datos;
public class presentar_un_ejemplo_usando_variables_y_tipos_de_datos {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 20;
        double altura = 1.75;
        boolean estudiante = true;
        int edadEn10Anios = edad + 10;
        double alturaEnCm = altura * 100;
        boolean esMayorDeEdad = edad >= 18;
        System.out.println("======================================");
        System.out.println("        informacion personal          ");
        System.out.println("======================================");
        System.out.println("nombre            : " + nombre);
        System.out.println("edad actual       : " + edad);
        System.out.println("altura (m)        : " + altura);
        System.out.println("altura (cm)       : " + alturaEnCm);
        System.out.println("¿es estudiante?   : " + estudiante);
        System.out.println("¿es mayor de edad?: " + esMayorDeEdad);
        System.out.println("edad en 10 años   : " + edadEn10Anios);
        System.out.println("======================================");
    }
}
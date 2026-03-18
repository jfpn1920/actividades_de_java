package operadores_logicos;
public class explica_con_comentarios_cada_operador {
    public static void main(String[] args) {
        int edad = 17;
        boolean tienePermiso = true;
        boolean esMayorDeEdad = edad >= 18;
        boolean puedeEntrarConAnd = esMayorDeEdad && tienePermiso;
        boolean puedeEntrarConOr = esMayorDeEdad || tienePermiso;
        boolean noEsMayorDeEdad = !esMayorDeEdad;
        System.out.println("es mayor de edad: " + esMayorDeEdad);
        System.out.println("puede entrar con and (&&): " + puedeEntrarConAnd);
        System.out.println("puede entrar con or (||): " + puedeEntrarConOr);
        System.out.println("no es mayor de edad (!): " + noEsMayorDeEdad);
    }
}
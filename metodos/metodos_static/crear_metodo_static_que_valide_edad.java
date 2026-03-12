package metodos_static;
public class crear_metodo_static_que_valide_edad {
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
    public static void main(String[] args) {
        int edad1 = 20;
        int edad2 = 15;
        boolean resultado1 = esMayorDeEdad(edad1);
        boolean resultado2 = esMayorDeEdad(edad2);
        System.out.println("edad " + edad1 + " es mayor de edad? " + resultado1);
        System.out.println("edad " + edad2 + " es mayor de edad? " + resultado2);
    }
}
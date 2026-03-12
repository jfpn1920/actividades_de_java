package metodos_con_parametros;
public class metodo_que_reciba_edad_y_diga_si_es_mayor_de_edad {
    public static void verificarMayorEdad(int edad) {
        if (edad >= 18) {
            System.out.println("con " + edad + " años, eres mayor de edad.");
        } else {
            System.out.println("con " + edad + " años, eres menor de edad.");
        }
    }
    public static void main(String[] args) {
        verificarMayorEdad(20);
        verificarMayorEdad(15);
    }
}
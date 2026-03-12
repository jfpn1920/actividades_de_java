package metodos_con_parametros;
public class metodo_que_reciba_temperatura_y_convierta_a_fahrenheit {
    public static void convertirAFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + "°c equivalen a " + fahrenheit + "°f");
    }
    public static void main(String[] args) {
        convertirAFahrenheit(0);
        convertirAFahrenheit(25);
        convertirAFahrenheit(100);
    }
}
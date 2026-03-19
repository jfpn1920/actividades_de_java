package nivel_de_preactica;
/*
   *****************************************************
   * Programa: Mejor Versión del Programa Base Java    *
   * Autor: Juan Felipe Peñaloza Nieto                 *
   * Fecha: 18/03/2026                                 *
   * Descripción: Este programa muestra cómo debe ser  *
   *              un programa Java bien estructurado,  *
   *              con encabezado, comentarios,         *
   *              variables descriptivas y salida      *
   *              clara en consola.                    *
   * Versión: 2.0                                      *
   *****************************************************
*/
public class presenta_tu_mejor_version_del_programa_base_java {
    // Método principal: punto de entrada del programa
    public static void main(String[] args) {
        // Mensaje de inicio del programa
        System.out.println("bienvenido a la mejor version del programa base java");
        // --------------------------
        // Declaración de variables
        // --------------------------
        int primerNumero = 15;
        int segundoNumero = 25;
        // --------------------------
        // Lógica de cálculo
        // --------------------------
        int suma = primerNumero + segundoNumero;
        int resta = segundoNumero - primerNumero;
        int producto = primerNumero * segundoNumero;
        // --------------------------
        // Salida de resultados
        // --------------------------
        System.out.println("primer numero: " + primerNumero);
        System.out.println("segundo numero: " + segundoNumero);
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("producto: " + producto);
        // --------------------------
        // Mensaje de finalización
        // --------------------------
        System.out.println("programa finalizado correctamente");
    }
}
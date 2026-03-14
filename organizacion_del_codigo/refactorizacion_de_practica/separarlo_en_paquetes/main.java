package refactorizacion_de_practica.separarlo_en_paquetes;
public class main {
    public static void main(String[] args) {
        String nombre = entrada_de_datos.leerTexto("ingrese nombre del estudiante: ");
        double nota = entrada_de_datos.leerDouble("ingrese nota final: ");
        estudiante estudiante = new estudiante(nombre, nota);
        String resultado = estudiante_service.evaluarEstudiante(estudiante);
        System.out.println(resultado);
        entrada_de_datos.cerrarScanner();
    }
}
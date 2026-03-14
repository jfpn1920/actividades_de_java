package estructura_profesional_en_consola;
public class documentar_estructura_en_readme {
    public static void main(String[] args) {
        mostrarDocumentacion();
    }
    public static void mostrarDocumentacion() {
        System.out.println("readme del proyecto");
        System.out.println();
        System.out.println("estructura del proyecto:");
        System.out.println();
        System.out.println("src/");
        System.out.println(" ├─ model/");
        System.out.println(" │   └─ clases que representan los datos del sistema.");
        System.out.println(" │      ejemplo: estudiante, persona, producto.");
        System.out.println();
        System.out.println(" ├─ service/");
        System.out.println(" │   └─ clases que contienen la logica del programa.");
        System.out.println(" │      ejemplo: estudiante service.");
        System.out.println();
        System.out.println(" └─ app/");
        System.out.println("     └─ clase principal donde se ejecuta el programa.");
        System.out.println("        ejemplo: main.");
        System.out.println();
        System.out.println("este proyecto sigue una estructura profesional basica para aplicaciones de consola en java.");
    }
}
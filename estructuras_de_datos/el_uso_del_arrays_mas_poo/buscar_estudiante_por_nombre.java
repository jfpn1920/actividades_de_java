package el_uso_del_arrays_mas_poo;
public class buscar_estudiante_por_nombre {
    String nombre;
    int edad;
    double nota;
    public buscar_estudiante_por_nombre(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " | edad: " + edad + " | nota: " + nota;
    }
}

//package el_uso_del_arrays_mas_poo;
//import java.util.Scanner;
//public class buscar_estudiante_por_nombre {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Estudiante[] estudiantes = new Estudiante[3];
//        estudiantes[0] = new Estudiante("juan", 20, 4.5);
//        estudiantes[1] = new Estudiante("maria", 21, 4.8);
//        estudiantes[2] = new Estudiante("pedro", 19, 4.2);
//        System.out.print("ingrese el nombre del estudiante a buscar: ");
//        String nombreBuscar = sc.nextLine();
//        boolean encontrado = false;
//        for (int i = 0; i < estudiantes.length; i++) {
//            if (estudiantes[i].nombre.equalsIgnoreCase(nombreBuscar)) {
//                System.out.println("estudiante encontrado:");
//                System.out.println(estudiantes[i]);
//                encontrado = true;
//                break;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("el estudiante no fue encontrado.");
//        }
//        sc.close();
//    }
//}
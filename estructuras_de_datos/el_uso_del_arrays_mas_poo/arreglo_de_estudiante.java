package el_uso_del_arrays_mas_poo;
public class arreglo_de_estudiante {
    String nombre;
    int edad;
    String carrera;
    double nota;
    public arreglo_de_estudiante(String nombre, int edad, String carrera, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.nota = nota;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("carrera: " + carrera);
        System.out.println("nota: " + nota);
        System.out.println("----------------------");
    }
}

//package el_uso_del_arrays_mas_poo;
//public class arreglo_de_estudiante {
//    public static void main(String[] args) {
//        Estudiante[] estudiantes = new Estudiante[3];
//        estudiantes[0] = new Estudiante("juan", 20, "ingenieria", 4.5);
//        estudiantes[1] = new Estudiante("maria", 22, "medicina", 4.8);
//        estudiantes[2] = new Estudiante("pedro", 19, "arquitectura", 4.2);
//        for (int i = 0; i < estudiantes.length; i++) {
//            estudiantes[i].mostrarDatos();
//        }
//    }
//}
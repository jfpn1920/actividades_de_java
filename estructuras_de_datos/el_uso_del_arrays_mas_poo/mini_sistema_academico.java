package el_uso_del_arrays_mas_poo;
public class mini_sistema_academico {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    public mini_sistema_academico(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
    @Override
    public String toString() {
        return "estudiante: " + nombre +
            " | nota1: " + nota1 +
            " | nota2: " + nota2 +
            " | nota3: " + nota3 +
            " | promedio: " + calcularPromedio();
    }
}

//package el_uso_del_arrays_mas_poo;
//public class mini_sistema_academico {
//    public static void main(String[] args) {
//        Estudiante[] estudiantes = new Estudiante[3];
//        estudiantes[0] = new Estudiante("juan", 4.5, 4.0, 4.2);
//        estudiantes[1] = new Estudiante("maria", 4.8, 4.7, 4.9);
//        estudiantes[2] = new Estudiante("pedro", 3.9, 4.1, 4.0);
//        System.out.println("sistema de estudiantes");
//        System.out.println("---------------------");
//        for (int i = 0; i < estudiantes.length; i++) {
//            System.out.println(estudiantes[i]);
//        }
//        double sumaPromedios = 0;
//        for (int i = 0; i < estudiantes.length; i++) {
//            sumaPromedios += estudiantes[i].calcularPromedio();
//        }
//        double promedioGeneral = sumaPromedios / estudiantes.length;
//        System.out.println("\n promedio general del curso: " + promedioGeneral);
//    }
//}
package el_uso_del_arrays_mas_poo;
public class calcular_promedio_general {
    String nombre;
    double nota;
    public calcular_promedio_general(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Nota: " + nota;
    }
}

//package el_uso_del_arrays_mas_poo;
//public class calcular_promedio_general {
//    public static void main(String[] args) {
//        Estudiante[] estudiantes = new Estudiante[4];
//        estudiantes[0] = new Estudiante("Juan", 4.5);
//        estudiantes[1] = new Estudiante("Maria", 4.8);
//        estudiantes[2] = new Estudiante("Pedro", 3.9);
//        estudiantes[3] = new Estudiante("Ana", 4.2);
//        double sumaNotas = 0;
//        for (int i = 0; i < estudiantes.length; i++) {
//            sumaNotas += estudiantes[i].nota;
//        }
//        double promedio = sumaNotas / estudiantes.length;
//        System.out.println("Promedio general de los estudiantes: " + promedio);
//    }
//}
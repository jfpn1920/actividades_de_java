package el_uso_del_arrays_mas_poo;
public class mostrar_datos_con_tostring {
    String nombre;
    int edad;
    public mostrar_datos_con_tostring(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " | edad: " + edad;
    }
}

//package el_uso_del_arrays_mas_poo;
//public class mostrar_datos_con_tostring {
//    public static void main(String[] args) {
//        Persona[] personas = new Persona[3];
//        personas[0] = new Persona("carlos", 28);
//        personas[1] = new Persona("ana", 21);
//        personas[2] = new Persona("luis", 35);
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(personas[i]);
//        }
//    }
//}
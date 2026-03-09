package el_uso_del_arrays_mas_poo;
public class arreglo_de_persona {
    String nombre;
    int edad;
    public arreglo_de_persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre + " - edad: " + edad);
    }
}

//package el_uso_del_arrays_mas_poo;
//public class arreglo_de_persona {
//    public static void main(String[] args) {
//        Persona[] personas = new Persona[3];
//        personas[0] = new Persona("carlos", 25);
//        personas[1] = new Persona("ana", 30);
//        personas[2] = new Persona("luis", 22);
//        for (int i = 0; i < personas.length; i++) {
//            personas[i].mostrarDatos();
//        }
//    }
//}
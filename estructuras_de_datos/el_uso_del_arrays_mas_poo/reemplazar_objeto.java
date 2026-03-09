package el_uso_del_arrays_mas_poo;
public class reemplazar_objeto {
    String nombre;
    int edad;
    public reemplazar_objeto(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " | edad: " + edad;
    }
}

//package el_uso_del_arrays_mas_poo;
//public class reemplazar_objeto {
//    public static void main(String[] args) {
//        Persona[] personas = new Persona[3];
//        personas[0] = new Persona("carlos", 25);
//        personas[1] = new Persona("ana", 30);
//        personas[2] = new Persona("luis", 22);
//        System.out.println("lista original:");
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(personas[i]);
//        }
//        personas[1] = new Persona("Maria", 28);
//        System.out.println("\n lista despues de reemplazar:");
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(personas[i]);
//        }
//    }
//}
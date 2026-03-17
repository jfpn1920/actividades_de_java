package metodo_tostring;
public class comparar_sin_tostring {
    private String nombre;
    private int edad;
    public comparar_sin_tostring(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("nombre: " + nombre + ", edad: " + edad);
    }
    public static void main(String[] args) {
        comparar_sin_tostring obj1 = new comparar_sin_tostring("carlos", 25);
        comparar_sin_tostring obj2 = new comparar_sin_tostring("carlos", 25);
        obj1.mostrarDatos();
        obj2.mostrarDatos();
        System.out.println("objeto 1: " + obj1);
        System.out.println("objeto 2: " + obj2);
        if (obj1 == obj2) {
            System.out.println("son el mismo objeto en memoria");
        } else {
            System.out.println("son objetos diferentes en memoria");
        }
    }
}
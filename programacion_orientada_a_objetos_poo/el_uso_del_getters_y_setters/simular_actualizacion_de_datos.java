package el_uso_del_getters_y_setters;
public class simular_actualizacion_de_datos {
    private String nombre;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
        simular_actualizacion_de_datos persona = new simular_actualizacion_de_datos();
        persona.setNombre("pedro");
        persona.setEdad(20);
        System.out.println("datos iniciales:");
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
        persona.setNombre("pedro gomez");
        persona.setEdad(21);
        System.out.println("\n datos actualizados:");
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
    }
}
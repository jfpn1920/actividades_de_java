package el_uso_del_getters_y_setters;
public class crear_clase_completamente_encapsulada {
    private String nombre;
    private int edad;
    private double salario;
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public static void main(String[] args) {
        crear_clase_completamente_encapsulada persona = new crear_clase_completamente_encapsulada();
        persona.setNombre("ana");
        persona.setEdad(28);
        persona.setSalario(2500.50);
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
        System.out.println("salario: " + persona.getSalario());
    }
}
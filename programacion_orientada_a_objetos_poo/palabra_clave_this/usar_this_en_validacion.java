package palabra_clave_this;
public class usar_this_en_validacion {
    private int edad;
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad; 
        } else {
            System.out.println("error: la edad no puede ser negativa.");
        }
    }
    public void mostrarEdad() {
        System.out.println("edad: " + this.edad);
    }
    public static void main(String[] args) {
        usar_this_en_validacion persona = new usar_this_en_validacion();
        persona.setEdad(25);
        persona.mostrarEdad();
        persona.setEdad(-5); 
        persona.mostrarEdad();
    }
}
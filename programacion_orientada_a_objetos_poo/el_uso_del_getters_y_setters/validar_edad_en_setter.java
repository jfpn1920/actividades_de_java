package el_uso_del_getters_y_setters;
public class validar_edad_en_setter {
    private int edad;
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("error: la edad no puede ser negativa.");
        }
    }
    public int getEdad() {
        return edad;
    }
    public static void main(String[] args) {
        validar_edad_en_setter persona = new validar_edad_en_setter();
        persona.setEdad(25);   
        System.out.println("edad: " + persona.getEdad());
        persona.setEdad(-5);   
        System.out.println("edad actual: " + persona.getEdad());
    }
}
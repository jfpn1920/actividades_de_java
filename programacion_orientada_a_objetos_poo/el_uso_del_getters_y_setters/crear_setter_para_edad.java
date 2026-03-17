package el_uso_del_getters_y_setters;
public class crear_setter_para_edad {
    private int edad;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public static void main(String[] args) {
        crear_setter_para_edad persona = new crear_setter_para_edad();
        persona.setEdad(25);
        System.out.println("edad: " + persona.getEdad());
    }
}
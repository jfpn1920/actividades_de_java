package acceso_a_modicar;
public class clase_con_atributos_publicos {
    public String nombre;
    public int edad;
    public String ciudad;
    public static void main(String[] args) {
        clase_con_atributos_publicos persona = new clase_con_atributos_publicos();
        persona.nombre = "juan";
        persona.edad = 25;
        persona.ciudad = "cartagena";
        System.out.println("nombre: " + persona.nombre);
        System.out.println("edad: " + persona.edad);
        System.out.println("ciudad: " + persona.ciudad);
    }
}
package refactorizacion_de_practica.separarlo_en_paquetes;
public class estudiante {
    private String nombre;
    private double nota;
    public estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }
}
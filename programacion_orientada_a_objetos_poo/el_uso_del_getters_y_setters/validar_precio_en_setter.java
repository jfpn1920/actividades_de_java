package el_uso_del_getters_y_setters;
public class validar_precio_en_setter {
    private double precio;
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("error: el precio debe ser mayor que 0.");
        }
    }
    public double getPrecio() {
        return precio;
    }
    public static void main(String[] args) {
        validar_precio_en_setter producto = new validar_precio_en_setter();
        producto.setPrecio(150.50);
        System.out.println("precio: " + producto.getPrecio());
        producto.setPrecio(-20);
        System.out.println("precio actual: " + producto.getPrecio());
    }
}
package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 4/12/17.
 */
public class Producto {
    private int precio;

    public Producto(String nombre, int precioUnitario, Establecimiento establecimiento) {
        this.precio = precioUnitario;
    }

    public int getPrecio() {
        return precio;
    }
}

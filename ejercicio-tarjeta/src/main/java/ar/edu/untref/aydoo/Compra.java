package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 4/12/17.
 */
public class Compra {

    private final int cantidad;
    private final Producto producto;

    public Compra(int cantidadDeCompra, Producto producto, Sucursal sucursal, Tarjeta tarjeta) {
        this.cantidad =  cantidadDeCompra;
        this.producto = producto;
    }

    public int calcularMontoBruto() {
        return cantidad * producto.getPrecio();
    }
}

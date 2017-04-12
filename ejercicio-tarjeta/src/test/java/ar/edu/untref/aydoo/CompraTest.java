package ar.edu.untref.aydoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nicopaez on 4/12/17.
 */
public class CompraTest {

    @Test
    public void deberiaCalcularMontoBruto() {

        Producto helado =  new Producto("helado", 10, null);
        Compra unaCompra = new Compra(2,helado, null, null);

        assertEquals(20, unaCompra.calcularMontoBruto());
    }
}

package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class CajaDeAhorroTest {

    @Test
    public void deberiaCrearseConSaldoCero() {
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
        Assert.assertEquals(0, cajaDeAhorro.getSaldo());
    }

    @Test
    public void deberiaIncrementarElSaldoCuandoAcredito() {
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
        int monto = 10;

        cajaDeAhorro.acreditar(monto);

        Assert.assertEquals(monto, cajaDeAhorro.getSaldo());
    }
}

package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 4/2/17.
 */
public class CajaDeAhorro {

    private int saldo;

    public int getSaldo() {
        return this.saldo;
    }

    public void acreditar(int monto) {
        this.saldo += monto;
    }
}

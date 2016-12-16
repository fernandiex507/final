package ensa;
import static org.junit.Assert.*;

/**
 * Created by user on 11/17/2016.
 */
public class cuentaTest {
@org.junit.Before

    @org.junit.Test
    public void mostrar() throws Exception {
        cuenta c= new cuenta("juan","A123");
        assertNotNull(c.mostrar());
    }

    @org.junit.Test
    public void pagar() throws Exception {
        cuenta c= new cuenta("juan","A123");
        c.calcular(100);
        assertEquals("juan pago 5 dolares, pendientes 0.70 ",0.7, c.pagar(5.0),1);
    }

    @org.junit.Test
    public void calcular() throws Exception {
        cuenta c= new cuenta("juan","A123");
        assertEquals("consumo de 100 deve ser saldo de 5.7", 5.7, c.calcular(100),1);
    }




}


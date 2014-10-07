package vehiculo.modelos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MotoTest extends VehiculoTest{

    private Moto moto;
    
    @Before
    public void before(){
        moto = new Moto(124, "Moto");
    }

    @Test
    public void mostrarTest() {
        assertEquals("El vehiculo es una moto con identificador 124 y descripcion Moto", moto.toString());
    }

    @Test
    public void devolverPrecioTest(int dias) {
        assertEquals(8.0, moto.devolverPrecio(dias), 10e-3);
    }

}

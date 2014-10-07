package vehiculo.modelos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class BicicletaTest extends VehiculoTest{

    private Bicicleta bici;
    
    @Before
    public void before(){
        bici = new Bicicleta(125, "Bici");
    }
    
    @Override
    public void mostrarTest() {
        assertEquals("El vehiculo es una bicicleta con identificador 125 y descripcion Bici", bici.toString());
    }

    @Override
    public void devolverPrecioTest() {
        assertEquals(3.0, bici.devolverPrecio(1), 10e-3);
    }

}

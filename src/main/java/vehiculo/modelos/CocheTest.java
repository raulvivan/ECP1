package vehiculo.modelos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CocheTest extends VehiculoTest{

    private Coche coche;
    
    @Before
    public void before(){
        coche = new Coche(123, "Coche", Categoria.A);
    }
    
    @Test
    public void mostrarTest() {
         assertEquals("El vehiculo es un coche con identificador 123, descripcion Coche y categoria A", coche.toString());  
    }

    @Test
    public void devolverPrecioTest() {
        assertEquals(10.0, coche.devolverPrecio(1), 10e-3);
    }

    
    

}

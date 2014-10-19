package vehiculo.modelos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CocheTest extends VehiculoTest{

    private Coche cocheA;
    private Coche cocheB;
    private Coche cocheC;
    
    @Before
    public void before(){
        cocheA = new Coche(123, "Coche", Categoria.A);
        cocheB = new Coche(123, "Coche", Categoria.B);
        cocheC = new Coche(123, "Coche", Categoria.C);
    }
    
    @Test
    public void mostrarTest() {
         assertEquals("El vehiculo es un coche con identificador 123, descripcion Coche y categoria A", cocheA.toString());  
    }

    @Test
    public void devolverPrecioTest() {
        assertEquals(10.0, cocheA.devolverPrecio(1), 10e-3);
        assertEquals(15.0, cocheB.devolverPrecio(1), 10e-3);
        assertEquals(20.0, cocheC.devolverPrecio(1), 10e-3);
    }

    
    

}

package vehiculo.modelos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehiculoHandlerTest {
    
    private VehiculoHandler handler;
    
    @Before
    public void before(){
        handler = new VehiculoHandler();
        handler.darAlta(new Coche(213, "coche", Categoria.A));
    }
    
    @Test
    public void devolverVehiculosTestYdarAlta(){
    	Vehiculo coche = new Coche(213, "coche", Categoria.A);
        assertEquals(coche, handler.devolverVehiculo(213));
    }
    
    @Test
    public void darPrecio(){
        assertEquals(38.0, handler.darPrecio(213, 4));
    }
    
    

}

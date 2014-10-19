package vehiculo.modelos;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

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
    	Map<Integer, Vehiculo> mapa = new HashMap<Integer, Vehiculo>();
    	mapa.put(213, new Coche(213, "coche", Categoria.A));
        assertEquals(mapa, handler.devolverVehiculo());
    }
    
    @Test
    public void darPrecio(){
        assertEquals(38.0, handler.darPrecio(213, 4), 10e-3);
    }
    
    

}
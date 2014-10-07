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
    public void mostrarVehiculosTestYdarAlta(){
        assertEquals("El vehiculo es un coche con identificador 213, descripcion coche y categoria A", handler.mostrarVehiculos());
    }
    
    @Test
    public void darPrecio(){
        assertEquals(30, handler.darPrecio(213, 4));
    }
    
    

}

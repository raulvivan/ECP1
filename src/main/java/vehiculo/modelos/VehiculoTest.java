package vehiculo.modelos;

import org.junit.Test;

public abstract class VehiculoTest {
    
    @Test
    public abstract void mostrarTest();
    
    @Test
    public abstract void devolverPrecioTest(int dias);

}

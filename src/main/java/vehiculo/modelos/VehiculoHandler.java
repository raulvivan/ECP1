package vehiculo.modelos;

import java.util.HashMap;
import java.util.Map;

public class VehiculoHandler {
    
    private Map<Integer, Vehiculo> vehiculos = new HashMap<Integer, Vehiculo>();

    public void darAlta(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getIdentificador(), vehiculo);
    }

    public Map<Integer, Vehiculo> devolverVehiculo() {
        return vehiculos;
    }

    public double darPrecio(int identificador, int dias) {
        return vehiculos.get(identificador).devolverPrecio(dias);
    }

}

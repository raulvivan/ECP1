package vehiculo.modelos;

import java.util.HashMap;
import java.util.Map;

public class VehiculoHandler {
    
    private Map<Integer, Vehiculo> vehiculos = new HashMap<Integer, Vehiculo>();

    public void darAlta(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getIdentificador(), vehiculo);
    }

    public Vehiculo devolverVehiculo(int identificador) {
        return vehiculos.get(identificador);
    }

    public double darPrecio(int identificador, int dias) {
        return vehiculos.get(identificador).devolverPrecio(dias);
    }

}

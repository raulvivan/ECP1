package vehiculo.main;

import upm.jbb.IO;
import vehiculo.controlador.VehiculoController;

public class VehiculoMain {
	
	public static void main(String[] args){
		IO.in.addController(new VehiculoController());
	}

}

package vehiculo.controlador;

import java.util.Map.Entry;

import upm.jbb.IO;
import vehiculo.modelos.Bicicleta;
import vehiculo.modelos.Categoria;
import vehiculo.modelos.Coche;
import vehiculo.modelos.Moto;
import vehiculo.modelos.Vehiculo;
import vehiculo.modelos.VehiculoHandler;

public class VehiculoController {
	
	VehiculoHandler handler;
	
	public VehiculoController(){
		handler = new VehiculoHandler();
	}
	
	public void darPrecio(){
		IO.out.println(""+handler.darPrecio(IO.in.readInt(), IO.in.readInt()));
	}
	
	public void darAltaCoche(){
		Categoria categorias[] = {Categoria.A, Categoria.B, Categoria.C};
		handler.darAlta(new Coche(IO.in.readInt("Introduzca el identificador del coche"), IO.in.readString("Introduzca la descripcion del coche"), (Categoria) IO.in.select(categorias, "Introduzca la categoria del coche")));
	}
	
	public void darAltaMoto(){
		handler.darAlta(new Moto(IO.in.readInt("Introduzca el identificador de la moto"), IO.in.readString("Introduzca la descripcion de la moto")));
	}
	
	public void darAltaBicicleta(){
		handler.darAlta(new Bicicleta(IO.in.readInt("Introduzca el identificador de la bicicleta"), IO.in.readString("Introduzca la descripcion de la bicicleta")));
	}
	
	public void devolverVehiculo(){
		IO.in.clear();
		for(Entry<Integer, Vehiculo> entry : handler.devolverVehiculo().entrySet()){
			IO.out.println(entry.getValue().toString()+"\n");
		}
		
	}

}

package vehiculo.modelos;

public class Moto extends Vehiculo{
    
    private static final int precioBase = 8;
    private static final int precioDescuento = 7;

    public Moto(int identificador, String descripcion) {
        super(identificador, descripcion);
    }

    public double devolverPrecio(int dias) {
        double precio = 0.0;
        double precioDia;
        if(dias<=7){
        	precioDia = precioBase;
        }else{
        	precioDia = precioDescuento;
        }
        for(int i=0;i<dias;i++){
	        precio +=precioDia;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Moto con identificador "+this.getIdentificador()+" y descripcion "+this.getDescripcion();
    }

}

package vehiculo.modelos;

public class Moto extends Vehiculo{
    
    private static final int precioBase = 8;
    private static final int precioDescuento = 7;

    public Moto(int identificador, String descripcion) {
        super(identificador, descripcion);
    }

    public double devolverPrecio(int dias) {
        double precio = 0.0;
        if(dias<=7){
            precio += precioBase;
        }else if(dias>7){
            precio += precioDescuento;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "El vehiculo es una moto con identificador "+this.identificador+" y descripcion "+this.descripcion;
    }

}

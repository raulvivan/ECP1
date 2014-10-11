package vehiculo.modelos;

public class Bicicleta extends Vehiculo{
    
    private final static int precioBase = 3;
    private final static int precioDescuento = 2;

    public Bicicleta(int identificador, String descripcion) {
          super(identificador, descripcion);
    }

    public double devolverPrecio(int dias) {
        double precio = 0.0;
        for(int i=1; i<=dias;i++){
            if(i<=2){
                precio += precioBase;
            }else if(i>2){
                precio += precioDescuento;
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        return "El vehiculo es una bicicleta con identificador "+this.getIdentificador()+" y descripcion "+this.getDescripcion();
    }

}

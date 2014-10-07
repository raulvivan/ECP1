package vehiculo.modelos;

public class Coche extends Vehiculo{

    private Categoria categoria;
    private static final double primerDescuento = 0.8;
    private static final double segundoDescuento = 0.5;
    
    public Coche(int identificador, String descripcion, Categoria categoria) {
        super(identificador, descripcion);
        this.categoria = categoria;
    }

    public double devolverPrecio(int dias) {
        double precio = 0.0;
        for(int i=1; i<=dias; i++){
            if(i<=3){
                precio += categoria.valor;
            }else if(i>=4 && i<=7){
                precio += categoria.valor*primerDescuento;
            }else if(i>7){
                precio += categoria.valor*segundoDescuento;
            }
        }
        return precio;
    }

    public String toString() {
        return "El vehiculo es un coche con identificador "+this.identificador+
                ", descripcion "+this.descripcion+" y categoria "+this.categoria;
    }

}

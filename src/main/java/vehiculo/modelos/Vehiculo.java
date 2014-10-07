package vehiculo.modelos;

public abstract class Vehiculo {
    
    protected int identificador;
    protected String descripcion;
    
    public Vehiculo(int identificador, String descripcion){
        this.identificador = identificador;
        this.descripcion = descripcion;
    }
    
    public abstract double devolverPrecio(int dias);
    
    public abstract String toString();

}

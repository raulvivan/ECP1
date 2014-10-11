package vehiculo.modelos;

public abstract class Vehiculo {
    
    private int identificador;
    private String descripcion;
    
    public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Vehiculo(int identificador, String descripcion){
        this.identificador = identificador;
        this.descripcion = descripcion;
    }
    
    public abstract double devolverPrecio(int dias);
    
    public abstract String toString();

}

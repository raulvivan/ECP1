package vehiculo.modelos;

public enum Categoria {
    A(10),
    B(15),
    C(20);
    
    public final int valor;
    
    private Categoria(final int valor){
        this.valor = valor;
    }
}

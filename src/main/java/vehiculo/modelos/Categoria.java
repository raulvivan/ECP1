package vehiculo.modelos;

public enum Categoria {
    A(0),
    B(1),
    C(2);
    
    private final int valor;
    
    private Categoria(final int valor){
        this.valor = valor;
    }
}

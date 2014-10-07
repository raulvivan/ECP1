package Operaciones;


public class Multiplication extends Operations{

    public Multiplication(final int operator1, final int operator2) {
        super(operator1, operator2);
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int operate() {
        return this.operator1 * this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "*" + operator2 + "]";
    }

}

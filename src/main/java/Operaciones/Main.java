package Operaciones;


public class Main {

    public static void main(String[] args) {
        OperationHandler operations = new OperationHandler();
        operations.add(new Summation(3, 4));

        System.out.println("Total1: " + operations.total());

        operations.add(new Subtraction(1, 1));
        operations.add(new Summation(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Summation(3, 6));
        operations.add(new Subtraction(3, 2));
        operations.add(new Multiplication(3, 4));

        System.out.println("Total2: " + operations.total());
    }

}

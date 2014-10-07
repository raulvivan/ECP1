package Operaciones;


public class OperationHandler {
    private Operations[] operators = new Operations[10];

    public void add(Operations operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    public int total() {
        int result = 0;
        String separator = "";
        for (Operations operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                    result += operando.operate();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }
}

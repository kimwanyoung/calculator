package challenge;

import challenge.operator.AbstractOperator;

public class Calculator {

    private boolean isRunning = true;
    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public void run() {
        while(isRunning) {
            Number first = display.readNumber();
            Number second = display.readNumber();

            String operator = display.readOperator();
            display.printResult(calculate(operator, first, second));

            if(display.readContinueOrExit()) isRunning = false;
        }
    }

    private double calculate(String operator, Number first, Number second) {
        AbstractOperator<Number> op = OperationType.getOperatorBySymbol(operator);
        return op.operate(first, second).doubleValue();
    }
}

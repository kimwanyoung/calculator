package challenge;

import challenge.operator.AbstractOperator;

public class Calculator {

    private Number firstNumber;
    private Number secondNumber;
    private AbstractOperator<Number> operator;

    public Calculator() {
    }

    public double calculate() {
        return operator.operate(firstNumber, secondNumber).doubleValue();
    }

    public void setFirstNumber(Number firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(Number secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(String operator) {
        this.operator = OperationType.getOperatorBySymbol(operator);
    }
}

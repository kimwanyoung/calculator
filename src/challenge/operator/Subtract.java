package challenge.operator;

import challenge.Operand;

public class Subtract extends AbstractOperator<Operand> {
    @Override
    public double operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue() - secondNumber.getValue();
    }
}

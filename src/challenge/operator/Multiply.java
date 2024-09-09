package challenge.operator;

import challenge.Operand;

public class Multiply extends AbstractOperator<Operand> {
    @Override
    public double operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue() * secondNumber.getValue();
    }
}

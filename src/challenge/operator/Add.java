package challenge.operator;

import challenge.Operand;

public class Add extends AbstractOperator<Operand> {
    @Override
    public double operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue() + secondNumber.getValue();
    }
}

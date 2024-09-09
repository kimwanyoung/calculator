package challenge.operator;

import challenge.Operand;

public class Divide extends AbstractOperator<Operand> {
    @Override
    public double operate(Operand firstNumber, Operand secondNumber) {
        if (secondNumber.getValue() == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return firstNumber.getValue() / secondNumber.getValue();
    }
}

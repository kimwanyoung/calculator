package challenge.operator;

import challenge.Operand;

import java.math.BigDecimal;

public class Subtract extends AbstractOperator {
    @Override
    public BigDecimal operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue().subtract(secondNumber.getValue());
    }
}

package lv3.operator;

import lv3.Operand;

import java.math.BigDecimal;

public class Multiply extends AbstractOperator {
    @Override
    public BigDecimal operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue().multiply(secondNumber.getValue());
    }
}

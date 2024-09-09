package lv3.operator;

import lv3.Operand;

import java.math.BigDecimal;

public abstract class AbstractOperator {
    public abstract BigDecimal operate(Operand firstNumber, Operand secondNumber);
}

package challenge.operator;

import challenge.Operand;

import java.math.BigDecimal;

public abstract class AbstractOperator {
    public abstract BigDecimal operate(Operand firstNumber, Operand secondNumber);
}

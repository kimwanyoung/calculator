package challenge;

import challenge.operator.*;

import java.math.BigDecimal;

public enum OperatorType {
    ADD("+", new Add()),
    SUB("-", new Subtract()),
    MUL("*", new Multiply()),
    DIV("/", new Divide());

    private final String type;
    private final AbstractOperator operator;

    OperatorType(String type, AbstractOperator operator) {
        this.type = type;
        this.operator = operator;
    }

    public BigDecimal operate(Operand first, Operand second) {
        return this.operator.operate(first, second);
    }

    public static OperatorType getOperatorType(String operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.type.equals(operator)) return op;
        }

        throw new IllegalArgumentException("제공하지 않는 연산입니다.");
    }

    @Override
    public String toString() {
        return this.type;
    }
}

package lv3;

import java.math.BigDecimal;

public class ResultLog {
    private final Operand first;
    private final Operand second;
    private final BigDecimal result;
    private final OperatorType operationType;

    public ResultLog(Operand first, Operand second, BigDecimal result, OperatorType operationType) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.operationType = operationType;
    }

    public boolean moreThan(BigDecimal number) {
        return this.result.compareTo(number) > 0;
    }

    @Override
    public String toString() {
        return first.getValue() + " " + operationType + " " + second.getValue() + " = " + result;
    }
}

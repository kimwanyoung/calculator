package challenge.operator;

public class Subtract extends AbstractOperator<Number> {
    @Override
    public Number operate(Number firstNumber, Number secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
}

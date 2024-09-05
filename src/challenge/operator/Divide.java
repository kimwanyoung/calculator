package challenge.operator;

public class Divide extends AbstractOperator<Number> {
    @Override
    public Number operate(Number firstNumber, Number secondNumber) {
        try {
            return firstNumber.doubleValue() / secondNumber.doubleValue();
        } catch (ArithmeticException exception) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }
}

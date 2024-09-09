package challenge;

public class Operand {

    private final Number value;

    public Operand(String inputValue) {
        validate(inputValue);
        this.value = parseValue(inputValue);
    }

    public double getValue() {
        return this.value.doubleValue();
    }

    private Number parseValue(String inputValue) {
        return Double.parseDouble(inputValue);
    }

    private void validate(String inputValue) {
        try {
            Double.parseDouble(inputValue);
        } catch (NumberFormatException exception2) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }
}

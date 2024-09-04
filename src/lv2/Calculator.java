package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";
    private static final List<Long> RESULT_HISTORY = new ArrayList<>();

    private Calculator() {
        throw new UnsupportedOperationException("[Error] : Calculator 클래스는 인스턴스화 할 수 없습니다.");
    }

    public static long calculate(String operator, long firstNumber, long secondNumber) {
        long result = 0;
        switch (operator) {
            case ADD -> result = firstNumber + secondNumber;
            case SUBTRACT -> result = firstNumber - secondNumber;
            case DIVIDE -> {
                // 나누기 연산 검증 처리
                try {
                    result = firstNumber / secondNumber;
                } catch (ArithmeticException exception) {
                    throw new ArithmeticException("[Error] : 나누기 연산 시 분모는 0이 될 수 없습니다.");
                }

            }
            case MULTIPLY -> result = firstNumber * secondNumber;
        }

        RESULT_HISTORY.add(result);
        return result;
    }
}

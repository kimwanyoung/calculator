package lv3;

import java.math.BigDecimal;

public class Calculator {

    private final Display display;
    private final ResultLogs resultLogs;
    private boolean isRunning = true;

    public Calculator(Display display, ResultLogs resultLogs) {
        this.display = display;
        this.resultLogs = resultLogs;
    }

    public void run() {
        while (isRunning) {
            Operand first = display.readNumber();
            Operand second = display.readNumber();
            OperatorType operator = display.readOperator();

            BigDecimal result = calculate(operator, first, second);
            display.printResult(result);

            resultLogs.save(first, second, result, operator);

            display.printLogs(resultLogs);
            display.printResultMoreThan(resultLogs, result);

            if (display.readContinueOrExit()) isRunning = false;
        }
    }

    private BigDecimal calculate(OperatorType operatorType, Operand first, Operand second) {
        return operatorType.operate(first, second);
    }
}

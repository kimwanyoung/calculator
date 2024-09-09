package lv3;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        ResultLogs resultLogs = new ResultLogs();
        Calculator calculator = new Calculator(display, resultLogs);

        calculator.run();
    }
}

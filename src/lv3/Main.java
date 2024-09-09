package lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new Scanner(System.in));
        ResultLogs resultLogs = new ResultLogs(new ArrayList<>());
        Calculator calculator = new Calculator(display, resultLogs);

        calculator.run();
    }
}

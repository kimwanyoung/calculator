package challenge;

import java.util.Scanner;

public class Display {

    private final String EXIT_COMMAND = "exit";
    private final Scanner scanner = new Scanner(System.in);

    public Number readNumber() {
        System.out.println("숫자를 입력하세요.");
        if(scanner.hasNextInt()) return scanner.nextInt();
        else if(scanner.hasNextDouble()) return scanner.nextDouble();
        else throw new IllegalStateException("숫자만 입력 가능합니다.");
    }

    public String readOperator() {
        scanner.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        return scanner.nextLine();
    }

    public boolean readContinueOrExit() {
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        return scanner.nextLine().equals(EXIT_COMMAND);
    }

    public void printResult(double result) {
        System.out.println("결과 : " + result);
    }
}

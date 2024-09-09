package challenge;

import java.util.List;
import java.util.Scanner;

public class Display {

    private static final String EXIT_COMMAND = "아니오";
    private static final String CONTINUE_COMMAND = "예";
    private final Scanner scanner = new Scanner(System.in);

    public Number readNumber() {
        System.out.println("숫자를 입력하세요.");
        if (scanner.hasNextInt()) return scanner.nextInt();
        else if (scanner.hasNextDouble()) return scanner.nextDouble();
        else throw new IllegalStateException("숫자만 입력 가능합니다.");
    }

    public String readOperator() {
        scanner.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        return scanner.nextLine();
    }

    public boolean readContinueOrExit() {
        System.out.println("더 계산하시겠습니까? - 예, 아니오 입력.");
        String command = scanner.nextLine();
        if (command.equals(CONTINUE_COMMAND)) return false;
        else if (command.equals(EXIT_COMMAND)) return true;
        else throw new IllegalStateException("예, 아니오만 입력 가능합니다.");
    }

    public void printResult(double result) {
        System.out.println("결과 : " + result);
    }

    public void printLogs(List<ResultLog> logs) {
        System.out.println("결과 리스트 조회 - 조회, 건너뛰기 입력.");
        String command = scanner.nextLine();
        if (command.equals("조회")) {
            logs.forEach(System.out::println);
        } else if (command.equals("건너뛰기")) {
            System.out.println("조회 건너뜀.");
        } else {
            throw new IllegalArgumentException("조회, 건너뛰기만 입력 가능합니다.");
        }
    }

    public void printResultMoreThan(List<ResultLog> logs, Number number) {
        System.out.println("현재 값보다 큰 값 조회 - 조회, 건너뛰기 입력.");
        String command = scanner.nextLine();
        if (command.equals("조회")) {
            logs.stream()
                    .filter((ResultLog log) -> log.moreThan(number))
                    .forEach(System.out::println);
        } else if (command.equals("건너뛰기")) {
            System.out.println("조회 건너뜀.");
        } else {
            throw new IllegalArgumentException("조회, 건너뛰기만 입력 가능합니다.");
        }
    }
}

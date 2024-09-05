package challenge;

import java.util.Scanner;

public class Main {

    private static final Calculator calculator = new Calculator();
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            Number firstNumber = readNumber();

            System.out.print("두 번째 숫자를 입력하세요: ");
            Number secondNumber = readNumber();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine();

            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setOperator(operator);

            System.out.println("결과 : " + calculator.calculate());
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit")) {
                flag = false;
            }
        }
    }

    private static Number readNumber() {
        if(sc.hasNextInt()) {
            return sc.nextInt();
        }
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        }
        throw new IllegalStateException("입력은 숫자만 가능합니다.");
    }
}

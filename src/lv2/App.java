package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // flag가 false될 때까지 무한 반복
        boolean flag = true;
        while(flag) {
            // 두 정수 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            long firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            long secondNumber = sc.nextInt();

            // 남아있는 개행문자 소비
            sc.nextLine();

            // 연산자 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine();

            // Calculator클래스 사용하여 계산 수정
            long result = Calculator.calculate(operator, firstNumber, secondNumber);
            System.out.println("결과 : " + result);

            // exit 입력시 반복문 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit")) {
                flag = false;
            }
        }
    }

}

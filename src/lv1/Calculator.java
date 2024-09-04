package lv1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();

        // 남아있는 개행문자 소비
        sc.nextLine();

        // 연산자 입력받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operator = sc.nextLine();

        // 양의 정수 검증
        validatePositiveInteger(firstNumber, secondNumber);
    }

    static void validatePositiveInteger(int firstNumber, int secondNumber) {
        if(firstNumber < 0 || secondNumber < 0) {
            throw new IllegalArgumentException("[Error] : 양의 정수만 입력 가능합니다.");
        }
    }
}

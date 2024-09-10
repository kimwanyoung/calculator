# 계산기 프로젝트

## 개요
계산기를 구현하는 프로젝트입니다. `src/lv3` 이 최종 버전이며 객체 지향 프로그래밍을 최대한 적용하려고 노력했습니다.  

## 주요 기능
- **피연산자 입력**: int, double 타입 모두 입력 기능.
- **연산자 입력**: 덧셈, 뺄셈, 곱셈, 나눗셈 입력 기능.
- **조회**: 현재까지의 결과 조회 기능.
- **현재 값보다 큰 값만 조회**: 현재 결과보다 큰 값만 조회 기능.

## 클래스 역할
- `Calculator.java`: 계산기 기능 실행을 담당하는 클래스 `Calculator.run()`을 통해 계산기 작동 시작. <br><br>
- `Display.java`: 입력과 출력을 담당하는 클래스 입력된 문자열로 인스턴스를 생성 및 반환함. <br><br>
- `AbstractOperator.java`: operate함수를 추상화 한 추상 클래스.
  - `Add.java`: 추상 메서드를 덧셈 연산으로 구현한 자식 클래스
  - `Divide.java`: 추상 메서드를 나눗셈 연산으로 구현한 자식 클래스
  - `Multiply.java`: 추상 메서드를 곱셈 연산으로 구현한 자식 클래스
  - `Subtract.java`: 추상 메서드를 뺄셈 연산으로 구현한 자식 클래스<br><br>
- `Operand.java`: 피연산자를 감싼 값 객체 피연산자의 검증을 관리함 <br><br>
- `OperatorType.java`: 연산자 종류를 모아놓은 enum클래스. 입력된 연산자의 검증과 인스턴스 필드에 있는 실제 연산 구현객체의 메서드(`operate()`)를 호출하는 역할을 함.<br><br>
- `ResultLog.java`: 결과 저장을 위한 값들을 관리하는 클래스. 출력을 위한 포맷팅과 비교를 위한 메서드를 제공함.<br><br>
- `ResultLogs.java`: `List<ResultLog>`를 인스턴스 필드로 갖는 일급 컬렉션. 저장 기능과 리스트 반환 기능을 담당함. <br><br>
- `Main.java`: 프로그램의 시작점 `Calculator`인스턴스가 생성되어 실행되는 클래스

## 실행 예시
![스크린샷 2024-09-10 오후 3.07.01.png](https://befitting-subway-0bf.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2Fec696ef1-489c-4a9e-b954-fe7608e4327d%2Fdc22e939-9c1f-4466-be00-528de4b6a84e%2F%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-09-10_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_3.06.29.png?table=block&id=d4497681-990b-4cfe-ad9f-40eab00ebcc4&spaceId=ec696ef1-489c-4a9e-b954-fe7608e4327d&width=580&userId=&cache=v2) <br/><br/>
![스크린샷 2024-09-10 오후 3.07.01.png](https://befitting-subway-0bf.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2Fec696ef1-489c-4a9e-b954-fe7608e4327d%2F6c835598-f339-401c-8e43-c4f479f5d089%2F%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-09-10_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_3.07.01.png?table=block&id=9380d6af-1079-4405-bd51-c3286e97c407&spaceId=ec696ef1-489c-4a9e-b954-fe7608e4327d&width=580&userId=&cache=v2)
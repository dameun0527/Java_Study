package assignment.step3;

// 3. 클래스 나누기

public class Calculator { // (1) 클래스 선언
    // (2) 필드
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    // (3) 생성자
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }
    
    // (4) 메소드

    public double calculate(String operator, int firstNumber, int secondNumber) {
        // - 클래스: Assignment.Calculator
        // - 리턴 타입이 double calculate 메소드를 받음
        // - 메소드: calculate - String 타입의 operator 매개변수
        // - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
        double answer = 0;
        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }
        return answer;
    };





    // 3. 연산 클래스 만들기
    // - AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기)
    // - 연산 클래스를 만든 후 클래스 간의 관계를 고려하여 Assignment.Calculator 클래스와 관계를 맺습니다.
    // - 관계를 맺은 후 필요하다면 Assignment.Calculator 클래스의 내부 코드를 변경합니다.
    // - 나머지 연산자(%) 기능은 제외합니다.
    // - Hint: Assignment.Calculator 클래스와 포함관계를 맺고 생성자를 통해 각각의 연산 클래스 타입의 필드에 객체를 주입합니다.
    // - calculate 메소드에서 직접 연산을 하지 않고 주입받은 연산 클래스들의 operate 메소드를 사용하여 연산을 진행합니다.

}

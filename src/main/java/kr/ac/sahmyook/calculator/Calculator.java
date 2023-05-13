package kr.ac.sahmyook.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    }


    public int subtraction(int num1, int num2) {
        int sub = num1+ num2;
        System.out.println("두 수의 차 : " +num1+" - "+num2+" = "+sub);
        return sub;
    }
    public int plus(int num1, int num2) {
        int plus = num1+ num2;
        System.out.println("두 수의 합 : " +num1+" + "+num2+" = "+plus);
        return plus;
    }

    public int divide(int num1,int num2){
        int div=0;
        try {
            div = (num1/ num2);
            System.out.println("두 수의 나눗셈 : " +num1+" / "+num2+" = "+div); // 예외발생시 실행되지 않음
        }
        catch ( ArithmeticException e) {
            System.out.println("0으로는 나눗셈을 할 수 없습니다.");
        }
        finally {
            System.out.println("나눗셈 완료");
        }
        return div;
    }
}

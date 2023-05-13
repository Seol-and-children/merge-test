package kr.ac.sahmyook.calculator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int num2 = sc.nextInt();
        Calculator cal = new Calculator();

        do {
            System.out.print("=====수행하실 사칙연산을 선택하세요=====\n" +
                    "1. 더하기\n" +
                    "2. 빼기\n" +
                    "3, 곱하기\n" +
                    "4, 나누기\n" +
                    "선택 : ");
            int select = sc.nextInt();
            if(select==1)  {
                System.out.println(cal.plus(num1, num2));   // 더하기
                break;
            }
            else if (select==2) {
                System.out.println(cal.subtraction(num1, num2));   // 빼기
                break;
            }
            else if (select==3) {
                System.out.println( cal.multiply(num1, num2));   // 곱하기
                break;
            }
            else if (select==4) {
                System.out.println(cal.divide(num1, num2));   // 나누기
                break;
            }
            else {
                System.out.println("제대로 선택하세요.");
                break;
            }
        } while (true);

    }

    public int multiply(int num1, int num2) {
        int multi = num1*num2;
        System.out.println("두 수의 곱 : " +num1+" * "+num2+" = "+multi);
        return multi;
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

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
        System.out.println(cal.multiply(num1, num2));   // 곱하기
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;         // 곱하기 메소드
    }
}

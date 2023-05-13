package kr.ac.sahmyook.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalaculatorTests {
    @DisplayName("곱하기 되는지 확인")
    @Test
    public void testMultiply() {
        Calculator cal = new Calculator();

        int num1 = 2;
        int num2 = 5;
        int multi = cal.multiply(num1, num2);

        Assertions.assertEquals(10, multi);
        }
    @DisplayName("빼기 연산 시작")
    @Test
    public void testSubtractionOperations() {
        Calculator calculator = new Calculator();
        int div = calculator.subtraction(3000, 1500);
        Assertions.assertEquals(1500, div);
    }
    @DisplayName("나눗셈 연산 확인")
    @Test
    public void testdivide(){
        Calculator cal = new Calculator();
        int testNum = cal.divide(4, 2);
        Assertions.assertEquals(2,testNum);
    }

    @DisplayName("더하기 프로그램")
    @org.junit.Test
    public void testplus() {
        Calculator calculator = new Calculator();
        int sum = calculator.plus(1,2);
        Assertions.assertEquals(3, sum);

    }

}

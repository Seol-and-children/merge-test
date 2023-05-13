package kr.ac.sahmyook.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class calculatorTest {
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

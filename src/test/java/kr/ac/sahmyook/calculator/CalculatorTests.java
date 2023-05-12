package kr.ac.sahmyook.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @DisplayName("곱하기 되는지 확인")
    @Test
    public void testMultiply() {
        Calculator cal = new Calculator();

        int num1 = 2;
        int num2 = 5;
        int multi = cal.multiply(num1, num2);

        Assertions.assertEquals(10, multi);
    }
}
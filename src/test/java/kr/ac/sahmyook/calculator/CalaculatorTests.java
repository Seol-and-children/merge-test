package kr.ac.sahmyook.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalaculatorTests {
    @DisplayName("초기상태 확인")
    @Test
    public void testgetSubtraction() {
        Calculator calculator = new Calculator();

        int subtraction = calculator.getSubtraction();
    }

    @DisplayName("연산 시작")
    @Test
    public void testSubtractionOperations() {
        Calculator calculator = new Calculator();

        calculator.subtractionoperations( 3000, 1500);
        int subtraction = calculator.getSubtraction();

        Assertions.assertEquals(1500, subtraction);
    }

}

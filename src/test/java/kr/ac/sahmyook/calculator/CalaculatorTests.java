package kr.ac.sahmyook.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalaculatorTests {

    @DisplayName("연산 시작")
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();

        calculator.Subtraction( 3000, 1500);
        int div = calculator.getDiv();

        Assertions.assertEquals(1500, div);
    }

}

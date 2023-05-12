package kr.ac.sahmyook.calculator;

import kr.ac.sahmyook.calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTests {

    @DisplayName("더하기 프로그램")
    @Test
    public void testplus() {
        Calculator calculator = new Calculator();
        int sum = calculator.plus(1,2);
        Assertions.assertEquals(3, sum);

    }


}


package kr.ac.sahmyook.calculator.test;

import kr.ac.sahmyook.calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import java.util.Scanner;
import java.util.zip.Adler32;

public class CalculatorTests {

    @DisplayName("더하기 프로그램")
    @Test
    public void testAddition() {
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;

        Assertions.assertEquals(3, sum);

    }


}


package be.intecbrussel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcTest {

    @Test
    public void isPositive_ShouldReturnTrueForPositiveNumber() {

        //Given
        int number = 5;

        //When
        boolean actual = new Calc().isPositive(number);

        //Then
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPositive_ShouldReturnTrueForZero() {
        //Given
        int number = 0;

        //When
        boolean actual = new Calc().isPositive(number);

        //Then
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPositive_ShouldReturnFalseForNegativeNumber() {
        //Given
        int number = -5;

        //When
        boolean actual = new Calc().isPositive(number);

        //Then
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -40, -2, 0, 2, 40, Integer.MAX_VALUE - 1})
    public void isEven_ShouldReturnTrueForEvenNumbers(int number) {
        //Given

        //When
        boolean actual = new Calc().isEven(number);

        //Then
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE + 1, -41, -3, 1, 3, 41, Integer.MAX_VALUE})
    public void isEven_ShouldReturnFalseForOddNumbers(int number) {
        //Given

        //When
        boolean actual = new Calc().isEven(number);

        //Then
        Assertions.assertFalse(actual);
    }


}
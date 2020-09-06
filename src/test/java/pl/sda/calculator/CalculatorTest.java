package pl.sda.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5.0, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 3 przy odejmowaniu 3 od 6")

    void shouldReturnThreeForGivenArgsOnSubstractionOperation() {
        //given
        int arg1 = 6;
        int arg2 = 3;

        //when
        int actual = sut.subtract(arg1, arg2);

        //then
        assertEquals(3, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 12 przy mnożeniu 4 razy 3")

    void shoudReturnTwelveForGivenArgsOnMultiplicationOperation() {
        //given
        int arg1 = 4;
        int arg2 = 3;

        //when
        int actual = sut.multiplication(arg1, arg2);

        //then
        assertEquals(12, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 0 przy mnożeniu 5 razy 0")

    void shouldReturnZeroForGivenArgsOnMultiplicationByZeroOperation() {
        //given
        int arg1 = 0;
        int argThatIsNotImportant = 5;

        //when
        int actual = sut.multiplication(argThatIsNotImportant, arg1);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 0 przy dzieleniu 0 przez dowolną liczbę")

    void shouldReturnZeroForGivenArgsOnDivideZeroByAnythingOperation() {
        //given
        int arg1 = 0;
        int arg2 = 15;

        //when
        int actual = sut.divide(arg1, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 5 przy dzieleniu 30 przez 6")

    void shouldReturnFiveForGivenArgsOnDivideThirtyBySixOperation() {
        //given
        int arg1 = 30;
        int arg2 = 6;

        //when
        int actual = sut.divide(arg1, arg2);

        //then
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 0 przy dzieleniu dowolnej liczby przez 0")

    void shouldReturnZeroForGivenArgsOnDivideByZeroOperation() {
        //given
        int argThatsValueIsNotImportant = 147;
        int arg2 = 0;

        //when
        int actual = sut.divide(argThatsValueIsNotImportant, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić true jeżeli liczba jest parzysta")

    void shouldReturnTrueForGivenEvenArg() {
        //given
        int arg = 148;

        //when
        boolean actual = sut.even(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić false jeżeli liczba nie jest parzysta")

    void shouldReturnFalseForGivenOddArg() {
        //given
        int arg = 147;

        //when
        boolean actual = sut.even(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić true jeżeli liczba jest nieparzysta")

    void shouldReturnTrueForGivenOddArg() {
        //given
        int arg = 197;

        //when
        boolean actual = sut.odd(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić false jeżeli liczba jest parzysta")

    void shouldReturnFalseForGivenEvenArg() {
        //given
        int arg = 144;

        //when
        boolean actual = sut.odd(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 4.5 przy liczeniu 30% z liczby 15")

    void shouldReturnProperPercentage() {
        //given
        double arg1 = 15;
        double arg2 = 30;

        //when
        double actual = sut.percent(arg1, arg2);

        //then
        assertEquals(4.5d, actual, 0.000001d);
    }

    @Test
    @DisplayName("Powinno zwrócić 5 przy liczeniu 25% z liczby 20")

    void shouldReturnProperPercentageForInteger() {
        //given
        double arg1 = 20;
        double arg2 = 25;

        //when
        double actual = sut.percent(arg1, arg2);

        //then
        assertEquals(5.0d, actual, 0.000001d);
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute() {
        int number  = 0;
        int expected = 0;

        int resutl = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, resutl);
    }
    @Test
    void findAbsolute1() {
        int number  = 1;
        int expected = 1;

        int resutl = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, resutl);
    }
    @Test
    void findAbsolute2() {
        int number  = -1;
        int expected = 1;

        int resutl = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, resutl);
    }
}
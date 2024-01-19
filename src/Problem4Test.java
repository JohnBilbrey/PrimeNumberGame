import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void romanNumeralConverterTest1() {
        String test = "III";
        int answer = 3;
        Assertions.assertEquals(answer, Problem4.romanNumeralConverter(test));
    }

    @Test
    void romanNumeralConverterTest2() {
        String test = "LVIII";
        int answer = 58;
        Assertions.assertEquals(answer, Problem4.romanNumeralConverter(test));
    }

    @Test
    void romanNumeralConverterTest() {
        String test = "MCMXCIV";
        int answer = 1994;
        Assertions.assertEquals(answer, Problem4.romanNumeralConverter(test));
    }
}
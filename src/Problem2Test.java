import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void palindromeCheckerTest1() {
        Assertions.assertEquals(true, Problem2.palindromeChecker(121));
    }

    @Test
    void palindromeCheckerTest2() {
        Assertions.assertEquals(false, Problem2.palindromeChecker(123));
    }

    @Test
    void palindromeCheckerTest3() {
        Assertions.assertEquals(false, Problem2.palindromeChecker(-121));
    }

    @Test
    void palindromeCheckerTest() {
        Assertions.assertEquals(false, Problem2.palindromeChecker(10));
    }

}
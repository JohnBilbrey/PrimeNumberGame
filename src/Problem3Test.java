import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void longestCommonPrefixTest1() {
        String[] test = new String[3];
        test[0] = "flower";
        test[1] = "flow";
        test[2] = "flight";
        String prefixAnswer = "fl";
        Assertions.assertEquals(prefixAnswer, Problem3.longestCommonPrefix(test));
    }

    @Test
    void longestCommonPrefixTest2() {
        String[] test = new String[3];
        test[0] = "dog";
        test[1] = "racecar";
        test[2] = "car";
        String prefixAnswer = "";
        Assertions.assertEquals(prefixAnswer, Problem3.longestCommonPrefix(test));
    }

    @Test
    void longestCommonPrefixTest3() {
        String[] test = new String[3];
        test[0] = "car";
        test[1] = "carter";
        test[2] = "carolina";
        String prefixAnswer = "car";
        Assertions.assertEquals(prefixAnswer, Problem3.longestCommonPrefix(test));
    }

    @Test
    void longestCommonPrefixTest4() {
        String[] test = new String[3];
        test[0] = "flower";
        test[1] = "flower";
        test[2] = "flower";
        String prefixAnswer = "flower";
        Assertions.assertEquals(prefixAnswer, Problem3.longestCommonPrefix(test));
    }


}
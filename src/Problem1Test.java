import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void problem1Test1() {
        int[] testArray = new int[3];
        testArray[0] = 4;
        testArray[1] = 5;
        testArray[2] = 7;
        int target = 9;
        int[] testAnswer = new int[2];
        testAnswer[0] = 0;
        testAnswer[1] = 1;
        Assertions.assertArrayEquals(testAnswer, Problem1.IndicesOfTargetSum(testArray, target));
    }

    @org.junit.jupiter.api.Test
    void problem1Test2() {
        int[] testArray = new int[4];
        testArray[0] = 2;
        testArray[1] = 7;
        testArray[2] = 11;
        testArray[3] = 15;
        int target = 9;
        int[] testAnswer = new int[2];
        testAnswer[0] = 0;
        testAnswer[1] = 1;
        Assertions.assertArrayEquals(testAnswer, Problem1.IndicesOfTargetSum(testArray, target));
    }

    @org.junit.jupiter.api.Test
    void problem1Test3() {
        int[] testArray = new int[3];
        testArray[0] = 3;
        testArray[1] = 2;
        testArray[2] = 4;
        int target = 6;
        int[] testAnswer = new int[2];
        testAnswer[0] = 1;
        testAnswer[1] = 2;
        Assertions.assertArrayEquals(testAnswer, Problem1.IndicesOfTargetSum(testArray, target));
    }

    @org.junit.jupiter.api.Test
    void problem1Test4() {
        int[] testArray = new int[2];
        testArray[0] = 3;
        testArray[1] = 3;
        int target = 6;
        int[] testAnswer = new int[2];
        testAnswer[0] = 0;
        testAnswer[1] = 1;
        Assertions.assertArrayEquals(testAnswer, Problem1.IndicesOfTargetSum(testArray, target));
    }
}
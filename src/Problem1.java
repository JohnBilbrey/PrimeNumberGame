import java.util.HashMap;

public class Problem1 {
    public static int[] IndicesOfTargetSum(int[] nums, int target){
        int[] numIndices = new int[2];

        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == compliment && j != i){
                    numIndices[0] = j;
                    numIndices[1] = i;
                }
            }
        }
        return numIndices;
    }


}

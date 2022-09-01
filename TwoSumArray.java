import java.util.Arrays;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] clone = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    result++;
                }
            }
        }
    }

    public int twoSumFast(int[] nums, int target) {
        int[] freq = new int[101];
        int current = 0;
        int result = 0;
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 0; i < heights.length; i++) {
            while (freq[current] == 0) {
                if (current != nums[i]) {
                    result++;

                }
                freq[current]--;
            }
        }
        return result;
    }


}
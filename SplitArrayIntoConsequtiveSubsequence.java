import java.util.HashMap;

// Given an unsorted array, find teh lengh of the longest sequence of consecutive numbers in the array

public class SplitArrayIntoConsequtiveSubsequence {

    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> availibilityMap = new HashMap<>();
        HashMap<Integer, Integer> vacancyMap = new HashMap<>();

        for (int i : nums) {
            availibilityMap.put(i, availibilityMap.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (availibilityMap.get(nums[i]) <= 0) {
                continue;
            }
            else if(vacancyMap.getOrDefault(nums[i],0)>0) {
                availibilityMap.put(nums[i], availibilityMap.getOrDefault(nums[i], 0) - 1);
                vacancyMap.put(nums[i], vacancyMap.getOrDefault(nums[i], 0) + 1);
                vacancyMap.put(nums[i] + 1, vacancyMap.getOrDefault(nums[i] + 1, 0) + 1);
            }

            else if (availibilityMap.getOrDefault(nums[i], 0) > 0 &&
            availibilityMap.getOrDefault(nums[i] + 1,0) > 0 &&
                    availibilityMap.getOrDefault(nums[i] + 2, 0) > 0)
            {
                availibilityMap.put(nums[i], availibilityMap.getOrDefault(nums[i], 0) - 1);
                vacancyMap.put(nums[i], vacancyMap.getOrDefault(nums[i], 0) + 1);
                vacancyMap.put(nums[i] + 1, vacancyMap.getOrDefault(nums[i] + 1, 0) + 1);
                vacancyMap.put(nums[i] + 2, vacancyMap.getOrDefault(nums[i] + 2, 0) + 1);
            }
            else {
                return false;
            }

        }
    }
}

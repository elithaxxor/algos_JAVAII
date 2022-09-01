// Given an unsorted array, find teh linegh of the longest sequence of consecutive number sin the array
// [4,2,1,6,5] = 3 ([4,5,6]

import java.util.HashSet;
// Given an array, find the lenght of the longest sequence of conequctive  numbers in the array

public class LongestSequenceConsecutiveSubArray {
    public int LongestSequenceArrayConsecutiveBrute(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public int LongestSequenceArrayConsecutiveBruteHash(int[] arr) {
        // create hash map, then push arr values to hash map for comparrasion later.
        HashSet<Integer> values = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            values.add(arr[i]);
        }
        // to compare consecutive values, we need to calculate max values
        int max = 0;
        for (int i : values) {
            if (values.contains(i-1)) {
                continue;
                int lenght = 0;
                while(values.contains(i++)) {
                    lenght++;
                    max = Math.max(max, lenght);
                }
                return max;

            }
            }
        }

    }


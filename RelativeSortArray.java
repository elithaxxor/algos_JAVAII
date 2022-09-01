import java.util.TreeMap;

public class RelativeSortArray {
    public int[] RelativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        // counts the frequency of values in array 1
        for (int i = 0; i <= arr1.length; i++) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        // loop thru array, and check for common values. increase if found
        // get the hash value for comparrasion in for loop
        int index = 0;
        for(int i : arr2) {
            int count = map.get(i);
            while(count --> 0) {
                arr1[index++]=i;
                map.remove(i);
            }
        }
    }
}

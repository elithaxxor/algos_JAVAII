import java.util.ArrayList;
import java.util.List;

// Create a window
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndices = new int[26];
        List<Integer> outputArray = new ArrayList<>();
        for (int i = 0; i<s.length(); i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndices[s.charAt(i) - 'a']);
            System.out.print("end: " + end);
            if (i == end) {
                outputArray.add(end-start+1);
                start = end + 1;
            }
        }
        return outputArray;
    }
}

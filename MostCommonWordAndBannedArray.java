import java.util.*;

public class MostCommonWordAndBannedArray {

    public static void main(String[] args) {
        String[] banned = {"a", "b"};
        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(mostCommonWord(banned, words));
    }

    public static String mostCommonWord(String[] banned, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        int max = 0;
        String result = "";
        for (String word : map.keySet()) {
            if (map.get(word) > max && !Arrays.asList(banned).contains(word)) {
                max = map.get(word);
                result = word;
            }
        }
        return result;
    }
}

import java.util.*;

public class MostFrequentWordInString {

    public static List<String> MostFrequentWordInString(String str, String[] exclusions) {
        str = str.replaceAll("[^a-zA-z0-9]", " ");
        String[] allWords = str.split(" +");
        Map<String, Integer> countingMap = new HashMap<>();

        System.out.println("allwords: \n" + allWords);
        System.out.println("string: \n" + str);

        // to map word frequency --> Key = word; value = frequency.
        for (String word : allWords) {
            word = word.toLowerCase();
            countingMap.put(word, countingMap.getOrDefault(word, 0) + 1); // if the word is not there, then default is 0
        }

        System.out.println("Count Frequency: \n" + countingMap.toString());

        // for exclusions list: iterate through exclusion array, and if found - remove from frequency map.
        for(String exclusion : exclusions) {
            if(countingMap.containsKey(exclusion)) {
                System.out.println("found exclusion \n " + exclusion);
                countingMap.remove(exclusion);
            }
        }
        TreeMap mostFrequentMap = new TreeMap<>((e1, e2) -> {
            int freq1 = countingMap.get(e1);
            int freq2 = countingMap.get(e2);
            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            return e1.compareTo(e2);
        });

        mostFrequentMap.putAll(countingMap);
        List<String> mostFrequentWords = new ArrayList<>();
        int topFreq = (int) mostFrequentMap.firstEntry().getValue();

        // ADD TOP FREQUENCY FROM TREEMAP INTO TOP FREQUENCY STRING -->
        while (!mostFrequentMap.isEmpty()) {
            Map.Entry<String, Integer> word = mostFrequentMap.pollFirstEntry();

            if (word.getValue() == topFreq) {
                mostFrequentWords.add(word.getKey());
            }
            else {
                break;
            }
        }
        return mostFrequentWords;
    }

}

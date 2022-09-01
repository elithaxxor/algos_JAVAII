import java.util.*;

public class ReorganizeGreedyHeapString {
public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }

    public static String reorganizeString(String S) {
        Map <Character, Integer> freqMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        // Setup data structure (priority queue) to hold the characters and their frequencies
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );

        // The data gets checked and CRUD'ed from hastable and stack.
        maxHeap.addAll(freqMap.keySet());
        StringBuilder results = new StringBuilder();
        while(maxHeap.size() > 0 ) {
            char first = maxHeap.poll();
            if (maxHeap.size() > 0) {
                char second = maxHeap.poll();
                results.append(first);
                results.append(second);
                freqMap.put(first, freqMap.get(first) - 1);
                freqMap.put(second, freqMap.get(second) - 1);
                maxHeap.add(first);
                maxHeap.add(second);
            } else {
                results.append(first);
            }
        }
        return results.toString();
    }
}

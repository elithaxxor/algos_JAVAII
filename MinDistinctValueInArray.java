import java.util.*;


// To Find the minimum distinct values in an array
// remove products (# defined by rem) and shrink array accordingly
// ids = [1,1,1,2,3,2] rem = 2
// output = 2

public class MinDistinctValueInArray {
    public static Map<Integer, Integer> sortMapByValues(Map <Integer, Integer> map) {
        List <Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map <Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static int removeProducts(List<Integer> ids, int rem) {

        // Hash map to index frequency of each element
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= ids.size(); i++) {
            Integer element = ids.get(i);
            if (!map.containsKey(element)){
                map.put(element, 1);
            } else {
                int count = map.get(element);
                count++;
                map.put(element, count);
            }

            // Method call to sort elements.
            map = sortMapByValues(map);
            int totalElements = 0;
            int removed = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                totalElements++;
                if (entry.getValue() <= rem) {
                    removed++;
                    rem = rem - entry.getValue();
                }
            }
            return totalElements-removed;
        }
        return rem;
    }
}


// prompt; find n days where where ratings array are decreasing consecutivly

import java.util.*;

public class FindConsecutiveLowerArray {
    public void FindConsecutiveLowerArray() {
        int [] ratings = {5, 3, 2, 4, 5, 3, 7, 4};
        int count = 0;
        int end = ratings.length;
        ArrayList<Integer> compliments = new ArrayList<>();
        for (int i = 0; i <= end; i++){
            for(int j = 0; j <= end - i; j++) {
                compliments = ratings[i];
            }
        }
    }
}

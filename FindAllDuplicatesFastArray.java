import java.util.ArrayList;
// Without adding space complexity, find all duplicates in an array.

public class FindAllDuplicatesFastArray {
    public static ArrayList<Integer> findAllDuplicatesFastArray(int[] array){
        ArrayList <Integer> results = new int[];    //declaring array
        for (int i = 0; i < array.length; i++){
            int index = Math.abs(array[1] - 1);
            if (array[i] <= 0) {
                results.add(index+1);
                array[index] = -array[index];
            }
        }
        return results;
    }
}

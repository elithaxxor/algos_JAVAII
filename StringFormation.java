import java.util.Arrays;

public class StringFormation {
    public int countCharicters(String [] words, String chars) {
        int sum = 0;

        // CREATES EMPTY ALPHABET ARRAY
        int[] alphabetIndex = new int[26];
        System.out.println("chars\n" + chars);
        System.out.println("words\n" + words);

        // INDEXES THE ALPHABET INPUT (CHAR) -- the occurances of each letter in input
        for (char c : chars.toCharArray()) {
            System.out.print(alphabetIndex[c-'a']++);
            alphabetIndex[c-'a']++;
        }

        for (String word : words ) {
           //    System.out.println("words \n" + word);
            int[] tempCharCount = Arrays.copyOf(alphabetIndex, alphabetIndex.length);
            int validCharCount = 0;

            for(char c : word.toCharArray()) {
                //System.out.print("chars \n" + c);
                if (tempCharCount[c-'a'] > 0 ) {
                    validCharCount++;
                    tempCharCount[c-'a']--;
                }
                if (validCharCount == word.length()) {
                    sum += word.length();
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) { //static method
        StringFormation run = new StringFormation();
        String[] arr = { "cat","bt", "hat", "tree" };
        String chars = "atach";
        run.countCharicters(arr, chars);
    }
}


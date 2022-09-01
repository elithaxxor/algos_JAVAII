import java.util.Arrays;

public class ReverseString {
    public void ReverseString (char [] c) {
        int left = 0;
        int right = c.length - 1;

        System.out.println("Original String  " + c.toString());
        // SWAP
        while (left < right) {
            char temp  = c[left];
            c[left++] = c[right];
            c[right--] = temp;
        }
        System.out.println("Reverse String: \n" + Arrays.toString(c));
    }
}

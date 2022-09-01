public class CompressString {
    public int copress(char [] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            i = j;
        }
        return index;
    }
}

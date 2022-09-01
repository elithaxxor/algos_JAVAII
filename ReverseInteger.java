// Given an integer, reverse it.
// use Long for results, to facilitate edge cases

public class ReverseInteger {
    public void ReverseInteger(int x) {
        long result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return;
            }

            int remainder = x % 10;
            result = result * 10 + remainder;
            x /= 10;
        }
    }
}

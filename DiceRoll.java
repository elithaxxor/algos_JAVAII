import java.util.HashMap;

public class DiceRoll {
    final int mod = 1000000007;

    public int numberOfRolls(int d, int f, int target) {
        HashMap map = new HashMap();
        if (target < d || target > d*f ) {
            return 0;
        }
        if (d == 1) {
            if (target <= f) {
                return 1;
            }
            return 0;
        }
        String key = ""+d+f+target;
        if (!map.containsKey(key)) {
            int sum = 0;
            for (int i = 1; i <= f; i++) {
                sum += numberOfRolls(d - 1, f, target - i);
                sum %= mod;
            }
            map.put(key, sum);

        }
        return (int) map.get(key);
    }
}

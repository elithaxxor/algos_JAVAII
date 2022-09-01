import java.util.HashMap;

public class DynamicRecursionTargetSumDice {
    final int mod = 1000000007;
    HashMap<String, Integer> map = new HashMap<>();


    public int numRollsToTarget(int d, int f, int target) {
        if (d == 0) {
            return target == 0 ? 1 : 0;
        }
        if (target < 0) {
            return 0;
        }
        String key = d + "-" + f + "-" + target;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int result = 0;
        for (int i = 1; i <= f; i++) {
            result = (result + numRollsToTarget(d - 1, f, target - i)) % mod;
        }
        map.put(key, result);
        return result;
    }
}

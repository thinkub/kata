import java.util.Collections;
import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class GetTotalX {
    private static final int MAX = 100;

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        long lcm = getLcm(a);
        int result = 0;

        for (int i = 0; i < MAX; i++) {
            long lcmTemp = lcm * (i + 1);
            if (b.stream().allMatch(b1 -> b1 % lcmTemp == 0)) {
                result++;
            }
        }
        return result;
    }

    private static long getLcm(List<Integer> a) {
        long result = a.get(0);
        long small;
        long big;

        for (Integer anA : a) {
            small = Math.min(result, anA);
            big = Math.max(result, anA);
            result = (small * big) / getGcd(small, big);
        }
        return result;
    }

    private static int getGcd(long small, long big) {
        int result = 0;
        for (int i = 1; i <= small; i++) {
            if (small % i == 0 && big % i == 0) {
                result = i;
            }
        }
        return result;
    }
}

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class GetTotalXTest {
    private static final int MAX = 100;

    @Test
    public void getTotalX() {
        List<Integer> a = Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91);
        List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long lcm = getLcm(a);
        int result = 0;

        for (int i = 0; i < MAX; i++) {
            long lcmTemp = lcm * (i + 1);
            if (b.stream().allMatch(b1 -> b1 % lcmTemp == 0)) {
                result++;
            }
        }
        System.out.println(result);
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
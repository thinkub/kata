import java.util.Arrays;
import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 6..
 */
public class DigPow {
    public static long digPow(int n, int p) {
        List<String> list = Arrays.asList(String.valueOf(n).split(""));
        int sum = 0;
        for (String s : list) {
            sum += Math.pow(Integer.valueOf(s), p);
            p++;
        }

        double result = (double) sum / (double) n;
        if (result % 1.0 > 0.0) {
            return -1;
        }

        return (long) result;
    }
}

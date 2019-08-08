import java.util.Arrays;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int longestCandle = ar[ar.length - 1];
        return (int) Arrays.stream(ar).filter(a -> a == longestCandle).count();
    }
}

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class BirthdayCakeCandlesTest {

    @Test
    public void birthdayCakeCandles() {
        int[] ar = {3, 2, 1, 3};
        Arrays.sort(ar);
        int longestCandle = ar[ar.length - 1];
        long result = Arrays.stream(ar).filter(a -> a == longestCandle).count();
        System.out.println(result);
    }
}
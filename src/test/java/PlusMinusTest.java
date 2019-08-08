import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class PlusMinusTest {

    @Test
    public void plusMinus() {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        int denominator = arr.length;
        long minusCount = Arrays.stream(arr).filter(a -> a < 0).count();
        long plusCount = Arrays.stream(arr).filter(a -> a > 0).count();
        long zeroCount = Arrays.stream(arr).filter(a -> a == 0).count();
        double minusPer = (double) minusCount / denominator;
        double plusePer = (double) plusCount / denominator;
        double zeroPer = (double) zeroCount / denominator;
        System.out.println(String.format("%.6f", Math.round(plusePer * 1000000) / 1000000.0));
        System.out.println(String.format("%.6f", Math.round(minusPer * 1000000) / 1000000.0));
        System.out.println(String.format("%.6f",Math.round(zeroPer * 1000000) / 1000000.0));
    }
}
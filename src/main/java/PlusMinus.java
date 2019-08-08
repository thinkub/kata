import java.util.Arrays;


/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
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

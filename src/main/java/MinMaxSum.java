import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 5..
 */
public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        List<Integer> arrs = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int minValue = arrs.stream().min(Long::compare).orElse(Integer.MIN_VALUE);
        int maxValue = arrs.stream().max(Long::compare).orElse(Integer.MAX_VALUE);

        long maxResult = arrs.stream().filter(a -> !a.equals(minValue)).mapToLong(Integer::intValue).sum();
        long minResult = arrs.stream().filter(a -> !a.equals(maxValue)).mapToLong(Integer::intValue).sum();

        if (isSaleValueArrs(minResult, maxResult)) {
            long result = arrs.stream().mapToLong(Integer::valueOf).sum() - arrs.get(0);
            System.out.printf("%d %d", result, result);
        } else {
            System.out.printf("%d %d", minResult, maxResult);
        }
    }

    private static boolean isSaleValueArrs(long minResult, long maxResult) {
        return minResult == 0 && maxResult == 0;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

import java.util.stream.IntStream;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class Codewars {
    public static String oddOrEven (int[] array) {
        // your code
        int sum = IntStream.of(array).sum();
        if (sum % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}

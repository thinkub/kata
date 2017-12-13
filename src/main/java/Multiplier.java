/**
 * Created by AL01485330 on 2017. 12. 13..
 */
public class Multiplier {
    public static long multiply(long a, long b) {
        long result;
        try {
            result = Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            throw e;
        }
        return result;
    }
}

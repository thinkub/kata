import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class PageCount {
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        if (isAscSearch(n, p)) {
            return p / 2;
        }
        return n % 2 == 0 ? Math.round((float) (n - p) / 2) : (n - p) / 2;

    }

    private static boolean isAscSearch(int n, int p) {
        return (float)n - p >= (float)n / 2;
    }
}

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class PageCountTest {

    @Test
    public void pageCount() {
        int n = 7;
        int p = 4;

        if (isAscSearch(n, p)) {
            System.out.println(p / 2);
        } else {
            System.out.println(n % 2 == 0 ? Math.round((float) (n - p) / 2) : (n - p) / 2);
        }
    }

    private static boolean isAscSearch(int n, int p) {
        return (float)n - p >= (float)n / 2;
    }


}
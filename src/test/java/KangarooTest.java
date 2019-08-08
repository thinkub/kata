import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class KangarooTest {
    private static final Integer MAX = 10000;

    @Test
    public void kangaroo() {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;
        boolean meet = false;

        for (int i = 0; i < MAX; i++) {
            x1 = x1 + v1;
            x2 = x2 + v2;

            if (x1 == x2) {
                meet = true;
                break;
            }
        }

        System.out.println(meet);
    }
}
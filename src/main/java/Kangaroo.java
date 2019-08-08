/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class Kangaroo {
    private static final Integer MAX = 10000;

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        boolean meet = false;

        for (int i = 0; i < MAX; i++) {
            x1 = x1 + v1;
            x2 = x2 + v2;

            if (x1 == x2) {
                meet = true;
                break;
            }
        }
        return meet ? "YES" : "NO";
    }
}

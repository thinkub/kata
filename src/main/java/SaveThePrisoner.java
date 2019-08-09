/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 9..
 */
public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int result = s + m - 1;
        if (result <= n) {
            return result;
        }
        if (result % n == 0) {
            return n;
        }
        return result % n;
    }
}

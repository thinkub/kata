import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class MoneySpent {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        List<Integer> sum = new ArrayList<>();

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                sum.add(keyboard + drive);
            }
        }

        return sum.stream().filter(s -> s <= b).max(Integer::compare).orElse(-1);
    }
}

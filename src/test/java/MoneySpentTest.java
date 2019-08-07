import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class MoneySpentTest {

    @Test
    public void getMoneySpent() {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int b = 10;

        List<Integer> sum = new ArrayList<>();

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                sum.add(keyboard + drive);
            }
        }

        int result = sum.stream().filter(s -> s <= b).max(Integer::compare).orElse(-1);
        System.out.println(result);
    }
}
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class PickingNumbersTest {

    @Test
    public void pickingNumbers() {
        List<Integer> a = Arrays.asList(1, 2, 2, 3, 1, 2);
        a.sort(Integer::compare);
        int result = 0;
        int resultTemp = 0;
        for (int i = 0; i < a.size(); i ++) {
            resultTemp = 0;
            for (int j = i; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                    resultTemp++;
                }
            }
            if (resultTemp > result) {
                result = resultTemp;
            }
        }
        System.out.println(result);
    }
}
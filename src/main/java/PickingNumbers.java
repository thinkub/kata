import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 7..
 */
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
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
        return result;
    }
}

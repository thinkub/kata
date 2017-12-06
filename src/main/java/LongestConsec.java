import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 5..
 */
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k < 0 || k == 0) {
            return "";
        }

        List<String> lists = new ArrayList<>();
        for (int i = 0; i < strarr.length; i++) {
            StringBuilder temp = new StringBuilder(strarr[i]);
            for (int j = i + 1; j < k + i; j++) {
                if (j < strarr.length) {
                    temp.append(strarr[j]);
                }
            }
            lists.add(temp.toString());
        }
        return lists.stream().reduce((s, s1) -> s1.length() > s.length() ? s1 : s).get();
    }
}

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 11..
 */
public class Order {
    public static String order(String words) {
        if (words.replaceAll("[^0-9]", "").length() == 0) {
            return "";
        }

        List<String> lists = Arrays.stream(words.split(" ")).collect(Collectors.toList());
        Map<Integer, Integer> listsIndexMap = new HashMap<>(lists.size());

        for (int i = 0; i < lists.size(); i++) {
            listsIndexMap.put(Integer.valueOf(lists.get(i).replaceAll("[^0-9]", "")), i);
        }

        List<String> resultList = new ArrayList<>(lists.size());
        for (int i = 0; i < lists.size(); i++) {
            resultList.add(lists.get(listsIndexMap.get(i + 1)));
        }
        return String.join(" ", resultList);

        // Best Practices
//        return Arrays.stream(words.split(" "))
//                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                .reduce((a, b) -> a + " " + b).get();
    }
}

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 6..
 */
public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> map = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> resultMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEachOrdered(m -> resultMap.put(m.getKey(), m.getValue()));

        return (int) resultMap.keySet().toArray()[0];

    }
}

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 6..
 */
public class MigratoryBirdsTest {
    @Test
    public void test() {
        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
        Map<Integer, Long> map = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> resultMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEachOrdered(m -> resultMap.put(m.getKey(), m.getValue()));
        System.out.println(resultMap.keySet().toArray()[0]);
    }

}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AL01485330 on 2017. 12. 5..
 */
public class RakeGarden {
    private static List<String> GARDEN = Arrays.asList("gravel", "rock");
    public static String rakeGarden(String garden) {
        List<String> strings =  Arrays.stream(garden.split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList();
        for (String s : strings) {
            if (GARDEN.stream().noneMatch(g -> g.equals(s)) ) {
                result.add(GARDEN.get(0));
            } else {
                result.add(s);
            }
        }
        return String.join(" ", result);
    }
}

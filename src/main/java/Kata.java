import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class Kata {
    public static String longestWord(String wordString) {
        // Give me back the longest word!
        List lists = Arrays.stream(wordString.split(" "))
                .sorted(Comparator.comparing(o -> o.toString().length()))
                .collect(Collectors.toList());
        return lists.get(lists.size() - 1).toString();
    }
}

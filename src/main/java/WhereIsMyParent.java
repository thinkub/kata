import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class WhereIsMyParent {
    static String findChildren(final String text) {

        List texts = Arrays.stream(text.split(""))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        return String.join("", texts);
    }
}

import java.util.Arrays;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 10..
 */
public class PangramChecker {
    public boolean check(String sentence){
        return Arrays.stream(sentence.replaceAll(" ", "").toLowerCase().split(""))
                .distinct()
                .filter(s -> s.matches("^[A-Za-z]*$"))
                .count() == 26;
    }
}

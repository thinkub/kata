import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 10..
 */
public class DubStep {
    public static String SongDecoder(String song) {
        return Arrays.stream(song.split("WUB"))
                      .filter(s -> !s.isEmpty())
                      .collect(Collectors.joining(" "));
    }
}

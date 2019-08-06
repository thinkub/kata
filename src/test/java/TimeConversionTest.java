import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 5..
 */
public class TimeConversionTest {

    @Test
    public void timeConversion() {
        String s = "19:05:45PM";
        String result =TimeConversion.timeConversion(s);
        System.out.println(result);
    }
}
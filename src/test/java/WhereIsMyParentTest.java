import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class WhereIsMyParentTest {
    private static void test(final String expected, final String input) {
        assertEquals("For input \"" + input + '"', expected, WhereIsMyParent.findChildren(input));
    }

    @Test
    public void basicTests() {
        test("AaBb", "abBA");
        test("AaaaaaZzzz", "AaaaaZazzz");
        test("AaBbbCcc", "CbcBcbaA");
        test("FfUuuuXx", "xXfuUuuF");
        test("", "");
    }
}
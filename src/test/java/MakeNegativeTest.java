import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class MakeNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, MakeNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, MakeNegative.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, MakeNegative.makeNegative(0));
    }
}
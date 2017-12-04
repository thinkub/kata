import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class KataTest {
    @Test
    public void tests() {
        assertEquals("fgh", Kata.longestWord("a b c d e fgh"));
        assertEquals("three", Kata.longestWord("one two three"));
        assertEquals("grey", Kata.longestWord("red blue grey"));
    }
}
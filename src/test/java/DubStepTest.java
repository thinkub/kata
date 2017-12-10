import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 10..
 */
public class DubStepTest {
    @Test
    public void Test1() {
        assertEquals("ABC", new DubStep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new DubStep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
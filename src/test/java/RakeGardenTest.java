import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AL01485330 on 2017. 12. 5..
 */
public class RakeGardenTest {
    @Test
    public void rakeGarden_BasicTest1() {
        String expectedResult = "gravel gravel rock gravel gravel gravel gravel gravel gravel gravel";
        assertEquals(expectedResult, RakeGarden.rakeGarden("slug spider rock gravel gravel gravel gravel gravel gravel gravel"));
    }
    @Test
    public void rakeGarden_BasicTest2() {
        String expectedResult = "gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel rock gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel rock gravel gravel";
        assertEquals(expectedResult, RakeGarden.rakeGarden("gravel gravel gravel gravel gravel gravel gravel gravel gravel rock slug ant gravel gravel snail rock gravel gravel gravel gravel gravel gravel gravel slug gravel ant gravel gravel gravel gravel rock slug gravel gravel gravel gravel gravel snail gravel gravel rock gravel snail slug gravel gravel spider gravel gravel gravel gravel gravel gravel gravel gravel moss gravel gravel gravel snail gravel gravel gravel ant gravel gravel moss gravel gravel gravel gravel snail gravel gravel gravel gravel slug gravel rock gravel gravel rock gravel gravel gravel gravel snail gravel gravel rock gravel gravel gravel gravel gravel spider gravel rock gravel gravel"));
    }

}
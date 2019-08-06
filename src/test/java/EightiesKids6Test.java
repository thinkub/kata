import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2018. 1. 15..
 */
public class EightiesKids6Test {
    @Test
    public void testFight1() {
        Robot robot1 = new Robot("Rocky", 100, 20, new String[] { "punch", "punch", "laser", "missile" });
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[] { "missile", "missile", "missile", "missile" });
        Map<String, Integer> tactics = new HashMap<>(3, 1f);
        tactics.put("punch", 20);
        tactics.put("laser", 30);
        tactics.put("missile", 35);
        assertEquals("Missile Bob has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }

    @Test
    public void testFight2() {
        Robot robot1 = new Robot("Rocky", 200, 20, new String[] { "punch", "punch", "laser", "missile" });
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[] { "missile", "missile", "missile", "missile" });
        Map<String, Integer> tactics = new HashMap<>(3, 1f);
        tactics.put("punch", 20);
        tactics.put("laser", 30);
        tactics.put("missile", 35);
        assertEquals("Rocky has won the fight.", EightiesKids6.fight(robot1, robot2, tactics));
    }
}
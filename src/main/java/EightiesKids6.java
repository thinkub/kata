import java.util.HashMap;
import java.util.Map;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2018. 1. 15..
 * https://www.codewars.com/kata/566b490c8b164e03f8000002/train/java
 */
public class EightiesKids6 {
    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
        Map<Integer, Integer> robot1Status = getRobotDeadTime(robot1.getHealth(), robot2, tactics);
        Map<Integer, Integer> robot2Status = getRobotDeadTime(robot2.getHealth(), robot1, tactics);



//        String wonRobotName = (robot1DeadTime < robot2DeadTime) ? robot2.getName() : robot1.getName();

//        return wonRobotName + " has won the fight.";
        return null;
    }

    private static Map<Integer, Integer> getRobotDeadTime(int robotHealth, Robot robot, Map<String, Integer> tatics) {
        int robotDeadTime = 0;
        for (int i = 0; i < robot.getTactics().length; i++) {
            if (robotHealth < 0) {
                break;
            }
            robotDeadTime += robot.getSpeed();
            robotHealth -= tatics.get(robot.getTactics()[i]);
        }

        Map<Integer, Integer> returnMap = new HashMap<>();
        returnMap.put(robotDeadTime, robotHealth);

        return returnMap;
    }
}

class Robot {
    private String name;
    private int health;
    private int speed;
    private String[] tactics;

    Robot(String name, int health, int speed, String[] tactics) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.tactics = tactics;
    }

    String getName() {
        return this.name;
    }

    int getHealth() {
        return this.health;
    }

    int getSpeed() {
        return speed;
    }

    String[] getTactics() {
        return this.tactics;
    }
}


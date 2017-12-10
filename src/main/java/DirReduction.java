import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2017. 12. 10..
 */
public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        Map<String, String> map = new HashMap<>();
        map.put("NORTH", "SOUTH");
        map.put("SOUTH", "NORTH");
        map.put("EAST", "WEST");
        map.put("WEST", "EAST");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }
            if (stack.peek().equals(map.get(arr[i]))) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        return stack.toArray(new String[0]);
    }
}

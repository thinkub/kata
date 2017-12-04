/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class Solution {
    private static int maxY;
    private static int maxX;

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){

        maxY = fighters.length - 1;
        maxX = fighters[0].length - 1;
        int[] movePosition = position;
        String[] choiceFighter = new String[moves.length];

        for (int i = 0; i < moves.length; i++) {

            movePosition = getPosition(moves[i], movePosition);
            choiceFighter[i] = getFighter(fighters, movePosition);
        }
        return choiceFighter;
    }

    private static int[] getPosition(String move, int[] position) {
        int y = position[0];
        int x = position[1];

        if ("up".equals(move)) {
            if (y == 0) {
                y = 0;
            } else {
                y = y - 1;
            }
        }
        if ("down".equals(move)) {
            if (y == maxY) {
                y = maxY;
            } else {
                y = y + 1;
            }
        }
        if ("left".equals(move)) {
            if (x == 0) {
                x = maxX;
            } else {
                x = x - 1;
            }
        }
        if ("right".equals(move)) {
            if (x == maxX) {
                x =  0;
            } else {
                x = x + 1;
            }
        }
        position = new int[] {y, x};

        return position;
    }

    private static String getFighter(String[][] fighters, int[] position) {
        return fighters[position[0]][position[1]];
    }
}

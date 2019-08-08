import java.util.Arrays;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class ClimbingLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            Integer[] scoreTemp = setResultTemp(scores, alice[i]);
            Arrays.sort(scoreTemp);

            int rank = Arrays.binarySearch(scoreTemp, alice[i]);
            result[i] = scoreTemp.length - rank;
        }

        return result;
    }
    private static Integer[] setResultTemp(int[] scores, int alice) {
        int[] mergeScores = new int[scores.length + 1];
        System.arraycopy(scores, 0, mergeScores, 0, scores.length);
        mergeScores[scores.length] = alice;
        return Arrays.stream(mergeScores).boxed().distinct().toArray(Integer[]::new);
    }
}

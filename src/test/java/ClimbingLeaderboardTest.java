import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.binarySearch;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class ClimbingLeaderboardTest {

    @Test
    public void bineryTest() {

        int[] scores = {100, 100, 50, 40, 20, 10, 5};
        Integer[] scoresTemp = Arrays.stream(scores).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(scoresTemp);
        int result = Arrays.binarySearch(scoresTemp, 50);
        System.out.println(scoresTemp.length - (result));
    }

    @Test
    public void climbingLeaderboard() {
        int[] scores = {100, 100, 50, 40, 20, 10};
        int[] alice = {5, 25, 50, 120};

        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            Integer[] scoreTemp = setResultTemp(scores, alice[i]);
            Arrays.sort(scoreTemp);

            int rank = Arrays.binarySearch(scoreTemp, alice[i]);
            result[i] = scoreTemp.length - rank;
        }

        System.out.println(result);

    }

    private Integer[] setResultTemp(int[] scores, int alice) {
        int[] mergeScores = new int[scores.length + 1];
        System.arraycopy(scores, 0, mergeScores, 0, scores.length);
        mergeScores[scores.length] = alice;
        return Arrays.stream(mergeScores).boxed().distinct().toArray(Integer[]::new);
    }

    private int getAliceRank(List<Integer> sortedScore, int alice) {
        int rank = 0;
        for (int i = 0; i < sortedScore.size(); i++) {
            if (sortedScore.get(i) == alice) {
                rank++;
                return rank;
            }
            if (i == 0) {
                rank++;
                continue;
            }
            if (sortedScore.get(i).equals(sortedScore.get(i - 1))) {
                continue;
            }

            rank++;
        }
        return rank;
    }

    @Test
    public void test() {
        int[] scores = {100, 100, 50, 40, 20, 10};
        int[] alice = {5, 25, 50, 120};
        int n = scores.length;
        int[] array = range(0,n).map(i->scores[n-i-1]).distinct().toArray();
        System.out.println(array);

        int index = 0;
        for(int score: alice) {
            index = binarySearch(array, index<0?0:index, array.length, score);
            if(index<0) index=-index-2;
            System.out.println(array.length-index);
        }
    }

}
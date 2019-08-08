import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class CountApplesAndOrangesTest {

    @Test
    public void countApplesAndOranges() {
        // 집 시작점
        int s = 2;
        // 집 종료점
        int t = 3;
        // 사과나무 위치
        int a = 1;
        // 오렌지나무 위치
        int b = 5;
        int[] apples = {2};
        int[] oranges = {-2};

        int resultApple = 0;
        int resultOrange = 0;

        // 사과
        for (int i = 0; i < apples.length; i++) {
            if (isInHouse(s, t, a + apples[i])) {
                resultApple++;
            }
        }

        // 오렌지
        for (int i = 0; i < oranges.length; i++) {
            if (isInHouse(s, t, b + oranges[i])) {
                resultOrange++;
            }
        }

        System.out.println(resultApple);
        System.out.println(resultOrange);

    }

    private boolean isInHouse(int houseStartPoint, int houseEndPoint, int target) {
        return houseStartPoint <= target && target <= houseEndPoint;
    }
}
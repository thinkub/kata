/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class CountApplesAndOranges {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int resultApple = 0;
        int resultOrange = 0;

        // 사과
        for (int apple : apples) {
            if (isInHouse(s, t, a + apple)) {
                resultApple++;
            }
        }

        // 오렌지
        for (int orange : oranges) {
            if (isInHouse(s, t, b + orange)) {
                resultOrange++;
            }
        }

        System.out.println(resultApple);
        System.out.println(resultOrange);

    }

    private static boolean isInHouse(int houseStartPoint, int houseEndPoint, int target) {
        return houseStartPoint <= target && target <= houseEndPoint;
    }
}

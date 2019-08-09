import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 9..
 */
public class SaveThePrisonerTest {

    @Test
    public void saveThePrisoner() {
        // 죄수 수
        int n = 999999999;
        // 사탕수
        int m = 871077789;
        // 죄수시작번호
        int s = 999999998;

        int a = s + m - 1;
        if (a > n) {
            if (a % n == 0) {
                System.out.println(n);
            } else {
                System.out.println(a % n);
            }
        }
        System.out.println(a);
    }
}
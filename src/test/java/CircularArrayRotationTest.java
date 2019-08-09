import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 9..
 */
public class CircularArrayRotationTest {

    @Test
    public void circularArrayRotation() {
        int a[] = {39356, 87674, 16667, 54260, 43958, 70429, 53682, 6169, 87496, 66190, 90286, 4912, 44792, 65142, 36183, 43856, 77633, 38902, 1407, 88185, 80399, 72940, 97555, 23941, 96271, 49288, 27021, 32032, 75662, 69161, 33581, 15017, 56835, 66599, 69277, 17144, 37027, 39310, 23312, 24523, 5499, 13597, 45786, 66642, 95090, 98320, 26849, 72722, 37221, 28255, 60906};
        int k = 51;
        int [] queries = {47, 10, 12};

        int aLength = a.length;
        int rotation = (aLength % k);
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        Collections.rotate(aList, rotation);
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = aList.get(queries[i]);
        }
        System.out.println(result);
    }
}
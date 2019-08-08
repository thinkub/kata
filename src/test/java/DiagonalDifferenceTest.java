import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DiagonalDifferenceTest {
	@Test
	public void test() {
		List<Integer> param2 = Arrays.asList(11, 2, 4);
		List<Integer> param3 = Arrays.asList(4, 5, 6);
		List<Integer> param4 = Arrays.asList(10, 8, -12);

		List<List<Integer>> param = Arrays.asList(param2, param3, param4);

		int result = DiagonalDifference.diagonalDifference(param);
		assertEquals(15, result);
	}

}
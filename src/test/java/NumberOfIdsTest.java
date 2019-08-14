import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfIdsTest {
	private static final String PREFIX = "8";
	private static final int TID_LENGTH = 11;

	@Test
	public void numOfIds() {
		String pool = "0011223344556677889988";
		if (pool.length() < 11) {
			System.out.println(0);
		}

		int result = 0;

		for (int i = 0; i < pool.length(); i++) {
			String tempPool = pool.substring(i, i + 1);
			if (isPrefix(tempPool)) {
				result++;
			}
		}
		System.out.println(Math.min(pool.length() / 11, result));
	}

	private static boolean isPrefix(String tempPool) {
		return PREFIX.equals(tempPool);
	}
}
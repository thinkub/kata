public class NumberOfIds {
	private static final String PREFIX = "8";
	private static final int TID_LENGTH = 11;

	public static int numOfIds(String pool) {
		if (pool.length() < TID_LENGTH) {
			return 0;
		}

		int result = 0;

		for (int i = 0; i < pool.length(); i++) {
			String tempPool = pool.substring(i, i + 1);
			if (isPrefix(tempPool)) {
				result++;
			}
		}
		return Math.min(pool.length() / TID_LENGTH, result);
	}

	private static boolean isPrefix(String tempPool) {
		return PREFIX.equals(tempPool);
	}
}

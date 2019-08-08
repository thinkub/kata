import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		Integer i = arr.stream().findFirst().get().size();
		int diagonalAsc = 0;
		int diagonaDesc = 0;
		for (int j = 0; j < i; j++) {
			List<Integer> arrs = arr.get(j);
			for (int k = 0; k < i; k ++) {
				int entity = arrs.get(k);
				if (k == j) {
					diagonalAsc += entity;
				}
				if (k + j == i - 1) {
					diagonaDesc += entity;
				}
			}
		}
		return Math.abs(diagonalAsc - diagonaDesc);
	}
}

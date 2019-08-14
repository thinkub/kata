import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunWithAnagrams {
	public static List<String> funWithAnagrams(List<String> s) {
		List<String> results = new ArrayList<>();
		Set<String> dupCheckSet = new HashSet<>();

		int size = s.size();

		for (int i = 0; i < size; i++) {
			setResult(s.get(i), dupCheckSet, results);
			for (int j = i + 1; j < size; j++) {
				if (!isAnagram(s.get(i), s.get(j))) {
					continue;
				}
				setResult(s.get(j), dupCheckSet, results);
			}
		}
		Collections.sort(results);
		return results;
	}

	private static void setResult(String s, Set<String> dupCheckSet, List<String> results) {
		String sortedString = sortedString(s);
		if (!dupCheckSet.contains(sortedString)) {
			dupCheckSet.add(sortedString);
			results.add(s);
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		int[] result = new int[26];

		for (char c : char1) {
			result[c - 97] = result[c - 97] + 1;
		}

		for (char c : char2) {
			result[c - 97] = result[c - 97] - 1;
		}

		for (int value : result) {
			if (value != 0) {
				return false;
			}
		}
		return true;
	}

	private static String sortedString(String s) {
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
		return new String(chr);
	}
}

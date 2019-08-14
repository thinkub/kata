import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FunWithAnagramsTest {

	@Test
	public void funWithAnagrams() {
		List<String> s = Arrays.asList("code", "doce", "ecod", "framer", "frame");

		List<String> results = new ArrayList<>();
		Set<String> dupCheckSet = new HashSet<>();

		int size = s.size();

		for (int i = 0; i < size; i++) {
			String sortedString = sortedString(s.get(i));
			if (!dupCheckSet.contains(sortedString)) {
				dupCheckSet.add(sortedString);
				results.add(s.get(i));
			}
			for (int j = i + 1; j < size; j++) {
				if (!isAnagram(s.get(i), s.get(j))) {
					continue;
				}
				String s2 = sortedString(s.get(j));
				if (!dupCheckSet.contains(s2)) {
					dupCheckSet.add(s2);
					results.add(s.get(i));
				}
			}
		}
		Collections.sort(results);
		System.out.println(results);
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
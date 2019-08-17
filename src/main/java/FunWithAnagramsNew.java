import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunWithAnagramsNew {
	static List<String> funWithAnagrams(List<String> s) {
		List<String> results = new ArrayList<>();
		Set<String> dupCheckSet = new HashSet<>();
		for (String string : s) {
			String sortedString = sortedString(string);
			if (!dupCheckSet.contains(sortedString)) {
				dupCheckSet.add(sortedString);
				results.add(string);
			}
		}
		Collections.sort(results);
		return results;
	}

	private static String sortedString(String s) {
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
		return new String(chr);
	}
}

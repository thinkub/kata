import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FunWithAnagramsNewTest {

	@Test
	public void funWithAnagrams() {
		List<String> s = Arrays.asList("code", "aaagmnrs", "anagrams", "doce");
		List<String> results = FunWithAnagramsNew.funWithAnagrams(s);
		System.out.println(results);
	}
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
	private static final String SPACE = " ";
	private static final String SHARP = "#";
	private static final String NEW_LINE = "\n";

	static void staircase(int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(makeStaircase(n, i));
			sb.append(NEW_LINE);
		}
		sb.deleteCharAt(sb.lastIndexOf(NEW_LINE));

		System.out.println(sb.toString());
	}

	private static String makeStaircase(int length, int floor) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length - floor; i++) {
			sb.append(SPACE);
		}
		for (int j = 0; j < floor; j++) {
			sb.append(SHARP);
		}
		return sb.toString();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}

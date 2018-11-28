package solver.util;

import solver.crosssum.CrossSumPredicate;

public class TestUtil {
	public static void main(String[] args) {
		String test = "+ * 156 + - 20 + * 146 - / 2 - / 4 + + 10";
		String[] split = test.split("\\s");
		for (String s : split) {
			System.out.println(s);
		}
	}
}

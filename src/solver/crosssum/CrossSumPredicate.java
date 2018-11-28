package solver.crosssum;

import solver.util.HexaPredicate;

public class CrossSumPredicate {
	public static HexaPredicate<Integer, Character, Integer, Character, Integer, Integer> crossPredicate() {
		HexaPredicate<Integer, Character, Integer, Character, Integer, Integer> p1 = (n1, s1, n2, s2, n3, r1) -> {
			int result = 0;
			switch (s1) {
			case '+':
				result = n1 + n2;
				break;
			case '-':
				result = n1 - n2;
				break;
			case '*':
				result = n1 * n2;
				break;
			case '/':
				result = n1 / n2;
				break;
			}

			switch (s2) {
			case '+':
				result += n3;
				break;
			case '-':
				result -= n3;
				break;
			case '*':
				result *= n3;
				break;
			case '/':
				result /= n3;
				break;
			}

			return result == r1;
		};
		return p1;
	}
}

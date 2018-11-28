package solver.util;

import java.util.ArrayList;

public class TestPermutation {
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6,7,8,9};
		ArrayList<ArrayList<Integer>> result = new Permutation<Integer>().permute(nums);
		for (ArrayList<Integer> r: result) {
			System.out.println(r);
		}
		
//		String[] test = {"a", "b", "c"};
//		ArrayList<ArrayList<String>> result = new Permutation<String>().permute(test);
//		for (ArrayList<String> r: result) {
//			System.out.println(r);
//		}
		
	}
}

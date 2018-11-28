package solver.util;

import java.util.ArrayList;

public class Permutation<T> {

	public ArrayList<ArrayList<T>> permute (T[] arrays){
		ArrayList<ArrayList<T>> result = new ArrayList<ArrayList<T>>();
		permute(arrays, 0, result);
		return result;
	}

	private void permute(T[] arrays, int start, ArrayList<ArrayList<T>> result) {
		// TODO Auto-generated method stub
		if (start >= arrays.length) {
			ArrayList<T> item = convertArrayToList(arrays);
			result.add(item);
		}
	 
		for (int j = start; j <= arrays.length - 1; j++) {
			swap(arrays, start, j);
			permute(arrays, start + 1, result);
			swap(arrays, start, j);
		}		
	}
	
	private ArrayList<T> convertArrayToList(T[] arrays) {
		ArrayList<T> item = new ArrayList<T>();
		for (int h = 0; h < arrays.length; h++) {
			item.add(arrays[h]);
		}
		return item;
	}
	 
	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

/*
 * Given a string generate permutations of all possible lengths 
 * and print them in any order. 
 * Now print the permutations in dictionary order.
 */

public class Solution {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		permuteHelper(num, 0, res);
		return res;
	}

	public void permuteHelper(int[] num, int start, List<List<Integer>> result) {
		if(start == num.length) {
			List<Integer> item = convertArrayToList(num);
			result.add(item);
		}

		for(int j = start; j < num.length; j++) {
			swap(num, start, j);
			permuteHelper(num, start + 1, result);
			swap(num, start, j);
		}
	}

	public List<Integer> convertArrayToList(int[] num) {
		List<Integer> newList = new ArrayList<Integer>();
		for(int i : num) {
			newList.add(i);
		}
		return newList;
	}

	public void swap(int[] num, int start, int j) {
		int temp = num[start];
		num[start] = num[j];
		num[j] = temp;
	}

}
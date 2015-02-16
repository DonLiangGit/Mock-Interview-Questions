/*
 * Given a string generate permutations of all possible lengths 
 * and print them in any order. 
 * Now print the permutations in dictionary order.
 */

public class solution {
public List<List<Integer>> permute(int[] num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	permute(num, 0, result);
    	return result;
    }
     
    public void permute(int[] num, int start, List<List<Integer>> result) {
     
    	if (start >= num.length) {
    		ArrayList<Integer> item = convertArrayToList(num);
    		result.add(item);
    	}
     
     	// Core code
    	for (int j = start; j <= num.length - 1; j++) {
    		swap(num, start, j);
    		permute(num, start + 1, result);
    		swap(num, start, j);
    	}
    }
     
    private ArrayList<Integer> convertArrayToList(int[] num) {
    	ArrayList<Integer> item = new ArrayList<Integer>();
    	for (int h = 0; h < num.length; h++) {
    		item.add(num[h]);
    	}
    	return item;
    }
     
    private void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
}
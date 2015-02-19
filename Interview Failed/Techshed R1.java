/*
 * Write a function that having an unsorted list of non-repeated
 * integers, returns all the pairs which sum is 16.
 */
public class Solution {
	public static ArrayList<NumberPairs> getPairs(int[] numbers, int solution) {
		ArrayList<NumberPairs> result = new ArrayList<NumberPairs>();
		if(numbers == null || numbers.length == 0) {
			return result;
		}

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int number : numbers) {
			if(!hashMap.containsKey(solution - number)) {
				hashMap.put(number, solution - number);
			} else {
				result.add(new NumberPairs(number, solution - number));
			}			
		}

		return result;	
	}
}
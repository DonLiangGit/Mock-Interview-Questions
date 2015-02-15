/*
 * Write a program to find the smallest number 
 * from an array with elements{1,10, -5, 10} Write the test cases for it(Give different input arrays to test ur code)
 */


public class Solution {
	public static int smallestElement(int[] A) {
		int smallestNum = Integer.MAX_VALUE;
		if(A == null || A.length == 0) {
			return 0;
		}
		for(int i : A) {
			if(i < smallestNum) {
				smallestNum = i;
			}
		}
		return smallestNum;
	}
}
/*
 * Write a java program thats takes a string and a character as input 
 * and return the string without that character. Do not use repalce function. 
 * For eg google, g should return oole
 */

public class solution {
	public int maxRepeatedNumberIndex(String str) {
		if(str == null) {
			return 0;
		}

		char[] charArray = str.toCharArray();
		int count = 1;
		int index = 0;
		int max = 1;
		int temp = 0;

		for(int i = 1; i < charArray.length; i++) {
			if(charArray[i] != charArray[i-1]) {
				if(count > max) {
					max = count;
					index = temp;
				}
				temp = i;
				count = 1;
			} else {
				count++;
			}
		}

		return count > max ? temp : index;
	}
}
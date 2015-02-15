/*
 * Write a java program thats takes a string and a character as input 
 * and return the string without that character. Do not use repalce function. 
 * For eg google, g should return oole
 */

public class solution {
	public int takeOutCharacter(String given, char c) {
		if(c == null) {
			return given;
		}

		StringBuffer sB = new StringBuffer();
		char[] charArray = give.toCharArray();
		for(char elem : charArray) {
			if(elem != c) {
				sB.append(elem);
			}
		}
		return sB.toString();
	}
}
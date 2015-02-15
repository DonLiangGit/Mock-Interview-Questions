/*
 * Given a string, return the string with the words reversed 
 * "I am good" -> "good am I" 
 * List test cases and if you were crunched on time 
 * and only had time to test one test case, which would you pick
 */

public class solution {
	public String reverseSentence(String str) {
		if(str == null || str.length == 0) {
			return "";
		}
		StringBuffere sB = new StringBuffer();
		String[] strings = str.split(" ");
		for(int i = strings.length ﹣ 1； i >= 0; i--) {
			if(!strings[i].equals("")) {
				sB.append(strings[i]).append(" ");
			}
		}
		if(sB.length() == 0) {
			return "";
		}
		sB.setLength(sB.length() - 1);
		return sB.toString();
	}
}
// if(sB.length() == 0) condition for input " "
//* if(!splitS[i].equals("")) for input " 1"
/*
 * How to replace the space in the string with "ABC" without using extra memory.. string may contain some extra memory. 
 * str = "i am chandu" -- str contation more memory... 
 * str = "iABCamABCchandu"
 */

public class solution {
	public String replaceWhiteSpace(String str) {
		if(str == null) {
			return "";
		}
		String abcString = "ABC";
		StringBuffer sB = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				sB.append(abcString);
			} else {
				sB.append(str.charAt(i));
			}
		}

		return sB.toString();
	}
}
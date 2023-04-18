
/**
*  Write a function to find the longest common prefix string amongst an array of strings.
*  If there is no common prefix, return an empty string "".
* 
*  Constraints:
*  1 <= strs.length <= 200
*  0 <= strs[i].length <= 200
*  strs[i] consists of only lowercase English letters.
*/

class Solution { 
  
    static public String longestCommonPrefix(String[] strs) { 
        String S = ""; 
		int[] lens = new int[strs.length];
		for(int x = 0; x < strs.length; x++) {
			 lens[x] = strs[x].length();
		}
		Arrays.sort(lens);
		char[] c = new char[strs.length];  
		for(int i = 0; i < lens[0]; i++) {
			for(int j = 0; j < strs.length; j++) {
				c[j] = strs[j].charAt(i);
			}
			int m=0;
			for(int n = m+1; n < c.length; n++) {
                if(c[m] != c[n]) {
                    return S; 
				}
			}
			S += c[0];
		}
			return S;
    }
}

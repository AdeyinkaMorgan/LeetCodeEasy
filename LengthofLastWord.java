/**
*  Given a string s consisting of words and spaces, return the length of the last word in the string.
*  A word is a maximal substring consisting of non-space characters only.
*  
*  Constraints:
*  1 <= s.length <= 104
*  s consists of only English letters and spaces ' '.
*  There will be at least one word in s.
*/


class Solution {
  
    static public int lengthOfLastWord(String s) {
		List<String> ans = new ArrayList<>();
		String[] arr = s.split("\s+"); 
		for(String b : arr) {
			if(b == "") {
				continue;
			}
			ans.add(b);
		}
		return ans.get(ans.size()-1).length();
			
    }
}

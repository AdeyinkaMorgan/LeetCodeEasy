/**
* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
* 
*  Constraints:
*  1 <= haystack.length, needle.length <= 104
*  haystack and needle consist of only lowercase English characters.
*/


class Solution { 
    
    static public int strStr(String haystack, String needle) {
		int j = needle.length(); int i;
		
        if (needle.length() > haystack.length()) {return -1;}
        
		if (needle.length()==0) {return 0;}
        
		for(i = 0; i < j; i++) {
			if(j > haystack.length()) {
				return -1;
			}
			if(haystack.substring(i, j).equals(needle)) {
				break;
			}
			j++;
		}
		return i;
    }
}

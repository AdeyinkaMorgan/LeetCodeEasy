/**
*  Given an integer x, return true if x is a palindrome, and false otherwise.
* 
*  Constraints:
*  -231 <= x <= 231 - 1
*/


class Solution {
   	 
  static public boolean isPalindrome(int x) {
		 List<Long> ans = new ArrayList<Long>();
		 long r;  long q = 1; int i = 1; long y = (long)x; long z = (long)x; 
		 double total = 0;
		 if(x < 0) {return false;}
		 do {
		 q = z / 10; 
		 r = z % 10;  
		 z = q;
		 ans.add(r);  
		 }while(q != 0);  
		 int len = ans.size(); 
		 for(Long j : ans) {
			 total += j * Math.pow(10, len-i);
			 i++;
		 }
		 Long result = (long)total; 
		 if(result == y) {return true;}
		 return false; 
	 }
}

/**
*  Constraints:
*  1 <= digits.length <= 100
*  0 <= digits[i] <= 9
*  digits does not contain any leading 0's.
*/


class Solution {
  
    static public int[] plusOne(int[] digits) {
		int k = digits.length - 1; 	digits[k] = digits[k] + 1; 
		for(int j = k; j >= 0; j--) {
				if(digits[j] == 10) {
					digits[j] = 0; 
					if(j==0) {
						break;
					}
					digits[j-1] = digits[j-1]+1;
				}			
			}
		if(digits[0] == 0) {
			int[] R = new int[digits.length+1]; 
			for(int i = 0; i < digits.length; i++) {
				if(i == 0) {
					R[i] = 1;
				}else{
					R[i] = 0;
				}
			}
			return R;
		}			
		return digits; 		
	}
}

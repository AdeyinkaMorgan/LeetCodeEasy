/**
*  Constraints: 
*  2 <= nums.length <= 104
*  -109 <= nums[i] <= 109
*  -109 <= target <= 109
*  Only one valid answer exists.
*/

public class Solution {  
	
	static public int[] twoSum(int[] nums, int target) {
		int i, j;
		int[] ans = new int[2] ; 
		for(i = 0; i < nums.length - 1; i++) {
			for(j = i+1; j < nums.length; j++) {
				if((nums[i] + nums[j]) == target) {
					ans[0] = i; 
					ans[1] = j;
          return ans;
				}
			}
		}
		return ans; 
	}
	public static void main(String[] args) {
		int[] ages = {1, 2, 3, 4, 7, 10}; 
		int target = 9; 
		for(int i: twoSum(ages, target)) {
			System.out.print(i + " ");
		}
	}
}

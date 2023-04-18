/** 
*  Given an integer array nums sorted in non-decreasing order, 
*  remove the duplicates in-place such that each unique element appears only once.
* 
*  Constraints:
*  1 <= nums.length <= 3 * 104
*  -100 <= nums[i] <= 100
*  nums is sorted in non-decreasing order.
*/


class Solution { 
    static public int removeDuplicates(int[] nums) { 
		int result = 0; int dup = 777; 
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == dup) {continue;}
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					nums[j] = dup; 
				}
			}
		}
		for(int a : nums) {if(a != dup) {result += 1;}}
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i]==dup) {
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] != nums[i]) {
						int t = nums[j];
						nums[j] = nums[i]; 
						nums[i] = t;
						break;
					}
				}
			}
		}
        return result; 
    }   
}

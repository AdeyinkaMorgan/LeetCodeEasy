/**
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
* The order of the elements may be changed. 
* Then return the number of elements in nums which are not equal to val
* 
*  Constraints:
*  0 <= nums.length <= 100
*  0 <= nums[i] <= 50
*  0 <= val <= 100
*/

class Solution { 
     static public int removeElement(int[] nums, int val) {
    	int k = 0;
    	int len = nums.length - 1; 
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == val) {
        		for(int j = len; j > i; j--) {
        			if(nums[j] != val) {
        				int t = nums[j];
        				nums[j] = nums[i]; 
        				nums[i] = t; 
        				break;
        			}
        		}
        	}
        }
         for(int m : nums) {
        		if(m != val)
        			k += 1; 
             }
        return k; 
    }
}

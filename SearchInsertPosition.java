/**
*  Given a sorted array of distinct integers and a target value, return the index if the target is found.
*  If not, return the index where it would be if it were inserted in order.
*  You must write an algorithm with O(log n) runtime complexity.
*
*  Constraints:
*  1 <= nums.length <= 104
*  -104 <= nums[i] <= 104
*  nums contains distinct values sorted in ascending order.
*  -104 <= target <= 104
*/


class Solution {
   static public int searchInsert(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1; 
        while(low <= high) {
        	int mid = (low + high)/2; 
        	int val = nums[mid]; 
        	if (val == target) {
        		return mid; 
        	}
        	if(val > target) {
        		high = mid-1;
        	}else {
        		low = mid + 1;
        	}
        }
        for(int i = 0; i < nums.length; i++) {
        	if(target < nums[i]) {
        		return i; 
        	}
        }                   
        return nums.length; 
    }
}

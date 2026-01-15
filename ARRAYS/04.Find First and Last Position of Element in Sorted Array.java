class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] index = {-1, -1};

        int left = 0;
        int right = nums.length - 1;

        boolean stopLeft = false;
        boolean stopRight = false;

        while (left < nums.length && right >= 0) {

           
            if (!stopLeft) {
                if (nums[left] == target && index[0] == -1) {
                    index[0] = left;
                    stopLeft = true;
                }
                if (nums[left] > target) {
                    stopLeft = true;
                }
                left++;
            }

          
            if (!stopRight) {
                if (nums[right] == target && index[1] == -1) {
                    index[1] = right;
                    stopRight = true;
                }
                if (nums[right] < target) {
                    stopRight = true;
                }
                right--;
            }

          
            if (stopLeft && stopRight) {
                break;
            }
        }

        return index;
    }
}




34. Find First and Last Position of Element in Sorted Array
Medium
Topics
premium lock icon
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

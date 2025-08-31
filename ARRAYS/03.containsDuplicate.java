class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if((h.containsKey(nums[i])) && (i-h.get(nums[i])<=k)){
                return true;

            }

            else{
                h.put(nums[i],i);
            }
        }

        return false;
    }
}


Description
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions


Code
Testcase
Test Result
Test Result
219. Contains Duplicate II
Solved
Easy
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

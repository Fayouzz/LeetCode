//https://leetcode.com/problems/majority-element/
// brute force
class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 1; j < nums.length; j++){
                if(nums[j] == nums[i]) count ++;
            }
            if(count > nums.length/2 ) return nums[i];
        }
        return ans;
    }
}
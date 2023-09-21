//https://leetcode.com/problems/monotonic-array/description/
class Solution {
    public boolean isMonotonic(int[] nums) {
         return inc(nums) || dec(nums);
    }

    public boolean dec(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]) return false;
        }
        return true;
    }

    public boolean inc(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}

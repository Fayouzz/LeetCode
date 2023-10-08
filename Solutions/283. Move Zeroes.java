//https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements from nums to temp
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                temp.add(nums[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of nums
        for (int i = 0; i < nz; i++) {
            nums[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < nums.length; i++) {
            nums[i] = 0;
        }
        
    }
}

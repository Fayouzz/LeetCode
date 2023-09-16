//https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        List<Integer> sortedNums = new ArrayList<>(nums);
        Collections.sort(sortedNums);

        for (int i = 0; i < n; i++) {
            if (nums.equals(sortedNums)) {
                return i; // The list is sorted
            }
            Collections.rotate(nums, 1); // Right shift by 1
        }

        return -1; // It's not possible to sort with right shifts
    }
}
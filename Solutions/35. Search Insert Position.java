package com.fayouz;
// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) {
            return 0;
        }
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (nums[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}

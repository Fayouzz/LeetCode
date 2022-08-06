package com.fayouz;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstnLastPosofElementinSortedArray {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];
        pos[0] = startingpos(nums, target);
        pos[1] = endingpos(nums, target);
        return pos;
    }
    static int startingpos(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>=target){
                end = mid - 1;
            }else{
                start=mid+1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    static int endingpos(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<=target){
                start = mid + 1;
            }else{
                end =mid - 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    }


package com.fayouz;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
        static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid+1]) {  // Decreasing part of the array

                    // May be the ans, but look at left
                    // This is why end != mid - 1
                    end = mid;
                } else {
                    // Ascending part of the array
                    start = mid + 1; // Because we know that mid+1 element > mid element
                }
            }
            return start;
        }
    }

package com.fayouz;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumwEvennoofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(FindNum(nums));
    }
    static int FindNum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int count = 0;
        if (num == 0) {
            count = 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
        count++;
        num /= 10;
        }
//      Else use:
//      if (num < 0) {
//          num = num * -1;
//      }
//      int count = (int)Math.log10(num) + 1;
        return count % 2 == 0;
    }
}

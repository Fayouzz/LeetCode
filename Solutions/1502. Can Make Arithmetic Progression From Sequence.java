//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for (int i = 1; i < arr.length; i++){
            int val = arr[i]-diff;
            if(val != arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
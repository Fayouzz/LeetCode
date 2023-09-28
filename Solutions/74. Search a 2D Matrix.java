//https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m * n - 1; // Total number of elements in the flattened matrix
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the mid index
            
            int row = mid / n; // Calculate the row index
            int col = mid % n; // Calculate the column index
            
            int midValue = matrix[row][col]; // Value at the middle index
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        
        return false; // Target not found
    }
}
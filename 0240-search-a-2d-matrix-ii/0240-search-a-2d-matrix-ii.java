class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            int st = 0;
            int end = m - 1;
            

            while(st <= end){
                int mid = st +((end - st) / 2);
                if(matrix[i][mid] == target) return true;
                if(matrix[i][mid] > target) end = mid - 1;
                if(matrix[i][mid] < target) st = mid + 1;
            }
        }

        return false;
    }
}
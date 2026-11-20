class Solution {
    public void change(int[][] arr, int row, int col){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < m; i++){
            arr[row][i] = 0;
        }

        for(int i = 0; i < n; i++){
            arr[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        Set<int[]> st = new HashSet<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0)st.add(new int[]{i, j});
            }
        }

        for(int[] num : st){
            change(matrix, num[0], num[1]);
        }
    }
}
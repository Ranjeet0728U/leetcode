class Solution {
    public int periCalculate(int[][] grid, int row, int col){
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;
        if(row == 0 || grid[row - 1][col] != 1)perimeter++;
        if(col == 0 || grid[row][col - 1] != 1)perimeter++;
        

        if(row == n - 1 || grid[row + 1][col] != 1)perimeter++;
        if(col == m - 1 || grid[row][col + 1] != 1)perimeter++;

        return perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int perimeter = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    perimeter += periCalculate(grid, i, j);
                }
            }
        }
        return perimeter;
    }
}
/**
 * @param {number[][]} grid
 * @return {number}
 */

 const pericalculate = function(grid, row, col){
    const n = grid.length;
    const m = grid[0].length;
    let perimeter = 0;
    if(row == 0 || grid[row - 1][col] != 1)perimeter++;
    if(col == 0 || grid[row][col - 1] != 1)perimeter++;
    
    if(row == n - 1 || grid[row + 1][col] != 1)perimeter++;
    if(col == m - 1 || grid[row][col + 1] != 1)perimeter++;
    return perimeter;
 }
var islandPerimeter = function(grid) {
    const n = grid.length;
    const m = grid[0].length;
    let perimeter = 0;

    for(let i = 0; i < n; i++){
        for(let j = 0; j < m; j++){
            if(grid[i][j] == 1){
                perimeter += pericalculate(grid, i, j);
            }
        }
    }
    return perimeter;
};
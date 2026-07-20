/**
 * @param {number[][]} grid
 * @param {number} k
 * @return {number[][]}
 */
var shiftGrid = function(grid, k) {
    const n = grid.length;
    const m = grid[0].length;

    k %= (m * n);

    const res = Array(n)
        .fill()
        .map(() => Array(m).fill(0));
    
    for(let i = 0; i < n; i++){
        for(let j = 0; j < m; j++){
            let newPos = (i * m) + j + k;

            let row = Math.floor(newPos / m) % n;
            let col = newPos % m;

            res[row % n][col] = grid[i][j];
        }
    }
    return res;
};
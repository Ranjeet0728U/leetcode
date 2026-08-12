/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    const n = matrix.length;
    const m = matrix[0].length;

    for(let i = 0; i < n; i++){
        let st = 0;
        let end = m - 1;
        
        while(st <= end){
            let mid = st +(Math.floor((end - st) / 2));
            if(matrix[i][mid] == target) return true;
            if(matrix[i][mid] > target) end = mid - 1;
            if(matrix[i][mid] < target) st = mid + 1;
        }
    }
    return false;
};
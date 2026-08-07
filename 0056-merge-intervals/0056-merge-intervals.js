/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {

    const n = intervals.length;

    if(n == 1) return intervals;
    
    intervals.sort((a, b) => a[0] - b[0]);

    const ans = new Array();

    let curr = intervals[0]

    for(let i = 1; i < n; i++){
        if(curr[1] >= intervals[i][0]){
            curr[1] = Math.max(intervals[i][1], curr[1]);
        }else{
            ans.push(curr);
            curr = intervals[i];
        }
    }
    ans.push(curr);

    return ans;
};  
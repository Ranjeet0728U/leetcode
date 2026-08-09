/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
var insert = function(intervals, newInterval) {
    const n = intervals.length;

    const ans = new Array();
    let i = 0;

    while(i < n && intervals[i][1] < newInterval[0]){
        ans.push(intervals[i++]);
    }
        

    while(i < n && intervals[i][0] <= newInterval[1]){

        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
    }

    ans.push(newInterval);

    while(i < n){
        ans.push(intervals[i++]);
    }

    return ans;
};
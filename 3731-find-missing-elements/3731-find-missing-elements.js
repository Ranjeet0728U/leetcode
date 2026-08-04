/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findMissingElements = function(nums) {
    const n = nums.length;

    const st = new Set();

    for(let i = 0; i < n; i++){
        st.add(nums[i])
    }

    nums.sort((a,b) => a - b);

    const arr = new Array();

    for(let i = nums[0]; i < nums[n - 1]; i++){

        if(!st.has(i)) arr.push(i);
    }

    return arr;
};
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    
    const n = nums.length

    const st = new Set();

    const arr = [];

    for(let i = 0; i < n; i++){
        st.add(nums[i])
    }

    for(let i = 1; i <= n; i++){
        if(!st.has(i)) arr.push(i)
    }

    return arr
};
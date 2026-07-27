/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    const res = nums.sort((a,b) => a - b);
    const n = nums.length;

    return (nums[n - 1] - 1) * (nums[n - 2] - 1);
};
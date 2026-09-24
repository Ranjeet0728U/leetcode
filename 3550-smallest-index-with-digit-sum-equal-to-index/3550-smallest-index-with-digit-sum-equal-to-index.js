/**
 * @param {number[]} nums
 * @return {number}
 */
var smallestIndex = function(nums) {

    const n = nums.length

    for(let i = 0; i < n; i++){

        let sum = 0
        let digit = nums[i]

        while(digit > 0){

            sum = sum + (digit % 10)
            digit = Math.floor(digit / 10)
        }

        if(sum == i) return i
    }

    return -1
};
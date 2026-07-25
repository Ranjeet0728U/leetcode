/**
 * @param {number} n
 * @return {number}
 */
var maxProduct = function(n) {
    const numString = String(n);
    const arr = numString.split('').sort();
    return arr.pop() * arr.pop();
};
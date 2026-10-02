/**
 * @param {number} n
 * @param {number} st
 * @param {number} end
 * @param {string} arr
 * @return {string[]}
 */

 var addParen = function(str, arr, st, end, n) {
    if(st == n && end == n){
        arr.push(str);
        return;
    }

    if(st < n) addParen(str+'(', arr, st + 1, end , n);

    if(end < st) addParen(str + ')', arr, st, end + 1, n);
 }
var generateParenthesis = function(n) {
    const arr = new Array();

    addParen('', arr, 0, 0, n);

    return arr
};
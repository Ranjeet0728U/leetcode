/**
 * @param {number[]} target
 * @param {number} n
 * @return {string[]}
 */
var buildArray = function(target, n) {
    let m = target.length;
    let curr = 1;
    const arr = new Array();

    for(let i = 0; i < m; i++){
        while(curr < target[i]){
            arr.push('Push');
            arr.push('Pop');
            curr++;
        }
        arr.push('Push');
        curr++;
    }
    return arr;
};
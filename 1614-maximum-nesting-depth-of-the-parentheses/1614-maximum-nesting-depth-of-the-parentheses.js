/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    const n = s.length

    let count = 0;
    let maxCount  = 0;

    for(let i = 0; i < n; i++){

        const ch = s[i]

        if( ch == '(' ){

            count += 1
            maxCount = Math.max(count, maxCount)
        }
        else if(ch == ')'){
            
            count -= 1
        }
    }

    return maxCount
};
/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    let st = ""

    const n = s.length

    let depth = 0;

    for(let i = 0; i < n; i++){

        const ch = s[i]

        if(ch === '('){
            if(depth > 0) st = st + ch
            depth++
        }else{
            depth--

            if(depth > 0) st = st + ch
        }
    }

    return st
};
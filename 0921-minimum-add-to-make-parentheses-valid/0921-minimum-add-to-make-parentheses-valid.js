/**
 * @param {string} s
 * @return {number}
 */
var minAddToMakeValid = function(s) {
    
    const n = s.length
    let invalidParen = 0;

    const st = new Array();

    for(let i = 0; i < n; i++ ){

        const ch = s[i];

        if(ch === '(') st.push(ch);

        if(ch === ')'){

            if(st.length != 0) st.pop();
            else invalidParen++;
        }
    }
    return (invalidParen + st.length)
};
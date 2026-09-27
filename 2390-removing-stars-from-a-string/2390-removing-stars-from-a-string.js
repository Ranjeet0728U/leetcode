/**
 * @param {string} s
 * @return {string}
 */
var removeStars = function(s) {
    const n = s.length

    let str = ""
    let idx = -1

    for(let i = 0; i < n; i++){
        const ch = s[i]

        if(ch == '*'){
            if(idx >= 0){
                str = str.slice(0, idx)
                idx--
            }
        }else{
            str = str + ch
            idx++
        }
    }

    return str
};
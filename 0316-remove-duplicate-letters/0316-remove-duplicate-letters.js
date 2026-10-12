/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicateLetters = function(s) {
    const n = s.length;

    const freq = new Array(32)
    const st = new Array()

    const seen = new Array(32);
    
    for(let i = 0; i < 32; i++){
        seen[i] = false
        freq[i] = 0
    }

    s.split('').map((ele) =>{
        let idx = ele.charCodeAt(0) - 97
        freq[idx]++
    });

    for(let i = 0; i < n; i++){
        const ch = s[i];

        let idx = ch.charCodeAt(0) - 97
        freq[idx]--
        
        if(seen[idx]) continue

        while(
            st.length > 0
            && st[st.length - 1] > ch
            && freq[(st[st.length - 1].charCodeAt(0) - 97)] > 0
        ){
            const top = st.pop();
            const Idx = top.charCodeAt(0) - 97;
            seen[Idx] = false;
        }

        st.push(ch)
        seen[idx] = true
    }

    let str = '';

    st.map(ele => str += ele)

    return str
};
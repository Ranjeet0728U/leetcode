/**
 * @param {string[]} tokens
 * @return {number}
 */

 const calculate = function(n1, n2, op){
    switch(op){
        case "+" : return n1 + n2;
        case "-" : return n1 - n2;
        case "*" : return n1 * n2;
        case "/" : return Math.trunc(n1 / n2);
        default : return -1;
    }
 }
var evalRPN = function(tokens) {
    const n = tokens.length;
    const st = new Array();

    for(let i = 0; i < n; i++){
        if(tokens[i] === '+' || tokens[i] === '-'|| tokens[i] === '*' || tokens[i] === '/'){
            let n2 = st.pop();
            let n1 = st.pop();

            st.push(calculate(n1, n2, tokens[i]));
        }else{
            st.push(Number(tokens[i]));
        }
    }
    return st.pop();
};
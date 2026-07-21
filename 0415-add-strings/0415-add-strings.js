/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    const l1 = num1.length;
    const l2 = num2.length;

    let i = l1 - 1;
    let j = l2 - 1;

    let carry = 0;

    let str = "";

    while(i >= 0 && j >= 0){
        let n1 = Number(num1[i--]);
        let n2 = Number(num2[j--]);

        let sum = n1 + n2 + carry;
        carry = Math.floor(sum / 10);

        str = String(sum % 10) + str;

    }
    while(i >= 0){
        let n1 = Number(num1[i--]);

        let sum = n1 + carry;
        carry = Math.floor(sum / 10);

        str = String(sum % 10) + str;

    }
    while(j >= 0){
        let n2 = Number(num2[j--]);

        let sum = n2 + carry;
        carry = Math.floor(sum / 10);

        str = String(sum % 10) + str;

    }

    if(carry != 0) str = String(carry) + str;
    return str;
};
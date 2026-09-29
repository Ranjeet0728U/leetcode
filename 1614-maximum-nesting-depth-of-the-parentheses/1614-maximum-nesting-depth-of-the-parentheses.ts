function maxDepth(s: string): number {
    const n: number = s.length

    let count : number = 0;
    let maxCount : number = 0;

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
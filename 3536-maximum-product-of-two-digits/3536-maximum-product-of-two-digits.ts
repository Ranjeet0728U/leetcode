function maxProduct(n: number): number {
    const numString : String = String(n);
    const arr = numString.split('').sort((a,b) => Number(a) - Number(b));
    return Number(arr.pop()) * Number(arr.pop());
};
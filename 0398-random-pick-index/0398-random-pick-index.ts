class Solution {

    private mp: Map<number, number[]>;
    constructor(nums: number[]) {
        this.mp = new Map();

        const n : number = nums.length;

        for(let i = 0; i < n; i++){
            if(!this.mp.has(nums[i])){
                this.mp.set(nums[i], [])
            }

            this.mp.get(nums[i])!.push(i);
        }
    }

    pick(target: number): number {
        const li : number[] = this.mp.get(target)!;

        const idx: number = Math.floor(Math.random() * li.length);

        return li[idx];
    }
}


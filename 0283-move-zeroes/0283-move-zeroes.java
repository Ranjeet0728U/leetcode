class Solution {
    
    public void moveZeroes(int[] nums) {
        int zeroPtr = 0;
        int n = nums.length;
        if(n == 1)return;

        while(zeroPtr < n && nums[zeroPtr] != 0) zeroPtr++;
        if(zeroPtr == n )return;

        for(int i = zeroPtr + 1; i < n; i++){
            
            if(nums[i] != 0){
                int tem = nums[i];
                nums[i] = nums[zeroPtr];
                nums[zeroPtr] = tem;
                while(zeroPtr < n && nums[zeroPtr] != 0) zeroPtr++;
                if(zeroPtr == n )return;
            }
        }

    }
}
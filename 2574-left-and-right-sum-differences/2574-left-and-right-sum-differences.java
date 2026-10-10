class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int k = 0;
        leftSum[k++] = 0;

        for(int i = 0; k < n; i++){
            leftSum[k++] = leftSum[i] + nums[i];
        }

        k = n - 1;

        rightSum[k -- ] = 0;

        int i = n - 1;

        while( k >= 0){
            rightSum[k--] = rightSum[i] + nums[i];
            i--;
        }

        int[] ans = new int[n];

        for(int j = 0; j < n; j++){
            ans[j] = Math.abs(leftSum[j] - rightSum[j]);
        }

        return ans;
    }
}
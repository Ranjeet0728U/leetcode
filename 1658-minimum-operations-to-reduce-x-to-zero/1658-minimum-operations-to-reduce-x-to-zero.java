class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        
        for (int num : nums) {
            total += num;
        }

        int target = total - x;
        if (target == 0) return n;
        if (target < 0) return -1;

        int sum = 0;
        int check = 0;
        int maxlength = -1;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum > target) {
                sum -= nums[check++];
            }

            if (sum == target) {
                maxlength = Math.max(maxlength,(i - check + 1));
            }
        }

        return maxlength== -1 ? -1 : (n - maxlength);
    }
}
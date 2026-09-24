class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){

            int sum = 0; 
            int number = nums[i];

            while(number > 0){
                
                int rem = number % 10;
                sum += rem;
                number /= 10;
            }

            if( sum == i ) return i;
        }
        return -1;
    }
}
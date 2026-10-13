class Solution {
    public int pivotInteger(int n) {
        long sumUpN = 0;
        long sum = 0;

        for(int i = 1; i <= n; i++) sumUpN += i;

        for(int i = 1; i <= n; i++){

            sum += i;

            long sumAfterI = sumUpN - sum  + i;

            if(sum == sumAfterI ) return i;
        }

        return -1;
        
    }
}
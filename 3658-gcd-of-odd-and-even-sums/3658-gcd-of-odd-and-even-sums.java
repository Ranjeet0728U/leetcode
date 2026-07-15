class Solution {

    public int gcdCalculator(int q1, int q2){
        while(q1 != 0 ){
            int rem = q2 % q1;
            q2 = q1;
            q1 = rem;
        }
        return q2;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < n; i++){
            oddSum += (2 * i + 1);
        }
        for(int i = 1; i <= n; i++){
            evenSum += (2*i);
        }

        return gcdCalculator(evenSum, oddSum);
    }
}
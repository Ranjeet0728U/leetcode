class Solution {
    public int reverseDegree(String s) {
        int ascii = (int)'a' - 1;
        int n = s.length();

        int[] sOP = new int[n];

        for(int i = 0; i < n; i++){
            int pos = (int)(s.charAt(i)) - ascii;
            int rev = 26 - pos + 1;

            sOP[i] = rev * (i + 1);
        }


        int sum = 0;

        for(int val : sOP){
            sum += val;
        }

        return sum;
    }
}
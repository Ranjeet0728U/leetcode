class Solution {
    public int findGCD(int[] arr) {
        int n = arr.length;
        int sNum = Integer.MAX_VALUE;
        int lNum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(sNum > arr[i]){
                sNum = arr[i];
            }
            if(lNum < arr[i]){
                lNum = arr[i];
            }
        }

        while(sNum > 0){
            int rem = lNum % sNum;
            lNum = sNum;
            sNum = rem;
        }
        return lNum;
    }
}
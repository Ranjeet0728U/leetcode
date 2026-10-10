class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length - 2;

        while( i >= 0 && arr[i] >= arr[i + 1]) i--;

        if(i < 0) return -1;

        int j = arr.length - 1;

        while( arr[j] <= arr[i]) j--;

        char tem = arr[j];
        arr[j] = arr[i];
        arr[i] = tem;

        int left = i + 1;
        int right = arr.length - 1;

        while(left < right){
            tem = arr[left];
            arr[left] = arr[right];
            arr[right] = tem;

            left++;
            right--;
        }

        long number = 0;

        for(i = 0; i < arr.length; i++){
            number = number * 10 + (arr[i] - '0');

        }

        return number > Integer.MAX_VALUE ? -1 : (int)number;


    }
}
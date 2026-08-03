class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            if(!st.isEmpty() && arr[st.peek()] < arr[i]){

                while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                    int days = st.pop();
                    res[days] = i - days;
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.pop()] = 0;
        }
        return res;
    }
}
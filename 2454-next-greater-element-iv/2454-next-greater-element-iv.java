class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            Stack<Integer> temp = new Stack<>();

            while(!st2.isEmpty() && nums[st2.peek()] < nums[i]){
                ans[st2.pop()] = nums[i];
            }

            while(!st1.isEmpty() && nums[st1.peek()] < nums[i]){
                temp.push(st1.pop());
            }

            while(!temp.isEmpty()){
                st2.push(temp.pop());
            }

            st1.push(i);
        }

        while(!st2.isEmpty()){
            ans[st2.pop()] = -1;
        }
        while(!st1.isEmpty()){
            ans[st1.pop()] = -1;
        }

        return ans;
    }
}
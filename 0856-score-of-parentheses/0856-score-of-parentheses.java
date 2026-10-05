class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(0);
            }else {
                int a = st.pop();
                a = Math.max(a * 2, 1);
                int b = st.pop();

                st.push((a + b));
            }
        }

        return st.pop();
    }
}
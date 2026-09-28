class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                StringBuilder sb = new StringBuilder("");

                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }

                if(!st.isEmpty()) st.pop();

                int len = sb.length();
                for(int j = 0; j < len; j++){
                    st.push(sb.charAt(j));
                }

            }else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder("");
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}
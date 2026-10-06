class Solution {
    public int minAddToMakeValid(String s) {
        int number = 0;
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++ ){
            char ch = s.charAt(i);

            if(ch == '(') st.push(ch);


            else if(ch == ')'){
                if(!st.isEmpty()) st.pop();
                else{
                    number++;
                }
            }
        }

        return number + st.size();
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int depth = 0;
        String str = "";

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(depth > 0){
                    str += ch;
                }
                depth++;
            }

            else{
                depth--;
                if(depth > 0){
                    str += ch;
                }
                
            }
        }

        return str;
    }
}
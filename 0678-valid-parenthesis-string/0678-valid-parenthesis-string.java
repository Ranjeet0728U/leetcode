class Solution {
    public boolean checkValidString(String s) {

        int n = s.length();

        Stack<Integer> op = new Stack<>();
        Stack<Integer> str = new Stack<>();


        for ( int i = 0; i < n; i++ ){
            char ch = s.charAt(i);

            if(ch == '('){
                op.push(i);
            }
            else if( ch == ')' ){
                if( !op.isEmpty() ) op.pop();
                else if( !str.isEmpty() ) str.pop();
                else return false;
            }
            else str.push(i);
        }

        while(!op.isEmpty() && !str.isEmpty() ) {
            if(op.peek() > str.peek()) return false;
            op.pop();
            str.pop();
        }

        return op.isEmpty();
    }
}
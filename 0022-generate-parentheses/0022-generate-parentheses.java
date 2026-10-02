class Solution {

    public void addParen(String st, List<String> li, int op, int cl , int n){
        if(op == n && cl == n){
            li.add(st);
            return;
        }

        if(op < n){
            addParen(st + '(', li, op + 1, cl , n);
        }
        if(cl < op){
            addParen(st + ')', li, op , cl + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();

        addParen("", li, 0,0, n);
        return li;
    }
}
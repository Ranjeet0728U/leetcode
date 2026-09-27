class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");

        int check = -1;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(check >= 0){
                    sb.deleteCharAt(check);
                    check--;
                }
            }else{
                sb.append(ch);
                check++;
            }
        }


        return sb.toString();
    }
}
class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
                maxCount = Math.max(maxCount, count);
            }else if(ch == ')'){
                count--;
            }
        }

        return maxCount;
    }
}
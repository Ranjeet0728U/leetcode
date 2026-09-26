class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();
        Set<Character> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            st.add(sentence.charAt(i));
        }

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!st.contains(ch)) return false;
        }
        return true;
    }
}
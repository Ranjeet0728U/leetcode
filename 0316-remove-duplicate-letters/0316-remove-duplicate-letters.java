class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();

        int[] freq = new int[26];
        Set<Character> seen = new HashSet<>();
        Stack<Character> st = new Stack<>();
        String str = "";

        for(int i = 0; i < n; i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++){

            char ch = s.charAt(i);
            freq[ch - 'a']--;

            if(seen.contains(ch)) continue;

            while(
                !st.isEmpty() 
                && st.peek() > ch
                && freq[st.peek() - 'a'] > 0
            ){

                seen.remove(st.pop());
            }

            st.push(ch);
            seen.add(ch);

        }

        while(!st.isEmpty()){
            str = st.pop() + str;
        }

        return str;

    }
}
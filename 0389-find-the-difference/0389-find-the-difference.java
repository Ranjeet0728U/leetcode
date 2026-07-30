class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();

        int n = s.length();
        int m = t.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch, 1);
            else mp.put(ch, mp.get(ch) + 1);
        }

        for(int i = 0; i < m; i++){
            char ch = t.charAt(i);

            if(!mp.containsKey(ch)) return ch;
            else{
                if(mp.get(ch) == 1){
                    mp.remove(ch);
                }else{
                    mp.put(ch, mp.get(ch) - 1);
                }
            }
        }
        return 'c';
    }
}
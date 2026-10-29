class Solution {
    public String keypad(char num){
        switch(num){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
        }
        return "";
    }
    public void letter(List<String> lt, String st, String lett){
        if(st.length() == 0){
            lt.add(lett);
            return;
        }
        String str = keypad(st.charAt(0));
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            letter(lt,st.substring(1),lett+ch);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        String str = "";
        List<String> lt = new ArrayList<>();
        letter(lt,digits,str);
        return lt;
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();

        int len = (l1 > l2)? l1 : l2;

        StringBuilder sum = new StringBuilder("");
        int carry = 0;

        int i = l1 - 1;
        int j = l2 - 1;


        while(i >= 0 && j >= 0){
            int n1 = (int)(num1.charAt(i--) - '0');
            int n2 = (int)(num2.charAt(j--) - '0');
            
            int addition = n1 + n2 + carry;
            carry = addition / 10;


            sum.insert(0, (char)((addition % 10) + '0'));

        }


        while(i >= 0){
            int n1 = (int)(num1.charAt(i--) - '0') + carry;            
            carry = n1 / 10;
            sum.insert(0, (char)((n1 % 10) + '0'));
        }
        while(j >= 0){
            int n2 = (int)(num2.charAt(j--) - '0') + carry;            
            carry = n2 / 10;
            sum.insert(0, (char)((n2 % 10) + '0'));
        }
        if(carry != 0) sum.insert(0, (char)(carry + '0'));
        return sum.toString();
    }
}
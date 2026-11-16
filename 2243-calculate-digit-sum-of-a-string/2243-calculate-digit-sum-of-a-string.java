class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            String summation = "";
            int n = s.length();
            int i = 0;
            while (i < n) {
                int sum = 0;

                for (int j = 0; j < k && i < n; j++) {
                    int digit = s.charAt(i) - '0';
                    sum += digit;
                    i++;
                }
                summation += Integer.toString(sum);
            }
            s = summation;
        }

        return s;
    }
}
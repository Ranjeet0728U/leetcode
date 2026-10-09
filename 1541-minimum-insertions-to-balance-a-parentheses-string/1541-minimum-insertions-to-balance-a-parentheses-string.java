class Solution {
    public int minInsertions(String s) {
        int op = 0;
        int requirement = 0;

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                op++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    requirement++;
                }

                if (op > 0) {
                    op--;
                } else {
                    requirement++;
                }
            }
        }

        return requirement + 2 * op;
    }
}
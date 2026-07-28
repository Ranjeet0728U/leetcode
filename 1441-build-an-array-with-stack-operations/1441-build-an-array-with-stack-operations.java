class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> str = new ArrayList<>();
        int curr = 1;

        for(int val : target){
            while(curr < val){
                str.add("Push");
                str.add("Pop");
                curr++;
            }
            str.add("Push");
            curr++;
        }
        return str;
    }
}
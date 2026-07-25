class Solution {
    public int maxProduct(int n) {
        String number = String.valueOf(n);
        char[] arr = number.toCharArray();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(char ch : arr){
            pq.add((int)(ch - '0'));
        }
        return (pq.poll() * pq.poll());
    }
}
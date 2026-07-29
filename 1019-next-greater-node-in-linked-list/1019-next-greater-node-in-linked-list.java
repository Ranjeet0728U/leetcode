/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        while(head != null){
            li.add(head.val);
            head = head.next;
        }

        int n = li.size();
        int[] arr = new int[n];
        int j = 0;
        for(int value : li){
            arr[j++] = value;
        }
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            res[st.pop()] = 0;
        }
        return res;
    }
}
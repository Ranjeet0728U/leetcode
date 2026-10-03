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

    int size ;
    ListNode li;

    public Solution(ListNode head) {
        li = head;

        while(head != null){
            size++;
            head = head.next;
        }
    }
    
    public int getRandom() {
        ListNode tem = li;
        int randElement = (int)(Math.random() * size) + 1;
        for(int i = 1; i < randElement; i++){
            tem = tem.next;
        }
        return tem.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
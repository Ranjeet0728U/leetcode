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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode tem = head;

        int size = 0;
        while(tem != null){
            size++;
            tem = tem.next;
        }

        int sizeOfList = size / k;
        int extra = size % k;

        tem = head;
        ListNode[] list = new ListNode[k];

        for(int i = 0; i < k; i++){
            list[i] = tem;

            int sizeOfArr = sizeOfList;

            if(extra > 0){
                sizeOfArr++;
                extra--;
            }
            
            for(int j = 1; j < sizeOfArr; j++){
                if(tem != null) tem = tem.next;
            }

            if(tem != null){
                ListNode nextPart = tem.next;
                tem.next = null;
                tem = nextPart;
            }

        }
        return list;
    }
}
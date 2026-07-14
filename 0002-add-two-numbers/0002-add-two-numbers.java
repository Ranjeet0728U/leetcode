class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode summation = new ListNode(100);
        ListNode add = summation;
        int carry = 0;
        while(l1 != null && l2 != null){
            int addValue = l1.val + l2.val + carry;
            carry = addValue / 10;
            ListNode tem = new ListNode(addValue % 10);
            add.next = tem;
            add = add.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int addValue = l1.val + carry;
            carry = addValue / 10;
            ListNode tem = new ListNode(addValue % 10);
            add.next = tem;
            add = add.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int addValue = l2.val + carry;
            carry = addValue / 10;
            ListNode tem = new ListNode(addValue % 10);
            add.next = tem;
            add = add.next;
            l2 = l2.next;
        }

        while(carry > 0){
            ListNode tem = new ListNode(carry % 10);
            carry = carry / 10;
            add.next = tem;
            add = add.next;
        }
        return summation.next;
    }
}
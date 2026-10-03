/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 */

var Solution = function(head) {
    this.size = 0
    this.head = head
    let tem = head
    while(tem != null){
        tem = tem.next
        this.size++
    }
};

/**
 * @return {number}
 */
Solution.prototype.getRandom = function() {
    const n = Math.floor(Math.random() * this.size) + 1
    let tem = this.head
    for(let i = 1; i < n; i++){
        tem = tem.next;
    }
    return tem.val
};

/** 
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(head)
 * var param_1 = obj.getRandom()
 */
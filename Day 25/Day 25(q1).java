//Q1 :- https://leetcode.com/problems/delete-node-in-a-linked-list/
//T.C. : O(1) & S.C. : O(1)
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
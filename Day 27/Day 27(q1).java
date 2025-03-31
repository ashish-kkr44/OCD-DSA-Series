//Day 27 Q1 : https://bit.ly/3w6hUaa
//T.C. : O(N) & S.C. : O(1) 
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode temp = head,ptr = null;
        if(head==null || head.next==null) {
            return head;
        }
        while(temp!=null) {
            ptr = temp.prev;
            temp.prev = temp.next;
            temp.next = ptr;
            temp = temp.prev;
        }
        return ptr.prev;
    }
}
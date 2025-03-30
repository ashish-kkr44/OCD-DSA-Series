//Day 26 Q1: https://bit.ly/3QD4hHs
//T.C. : O(N) & S.C. : O(1)
class Solution {
    Node addNode(Node head, int p, int x) {
        Node temp = new Node(x);
        if(head==null) return temp;
        Node ptr = head;
        while(p!=0) {
            ptr = ptr.next;
            p--;
        }
        if(ptr.next==null) {
            ptr.next = temp;
            temp.prev = ptr;
            return head;
        }
        temp.next = ptr.next;
        temp.prev = ptr;
        ptr.next.prev = temp;
        ptr.next = temp;
        return head;
    }
}
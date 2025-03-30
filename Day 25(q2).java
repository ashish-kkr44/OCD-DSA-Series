//Q2 : https://bit.ly/3w9pEIt
//T.C. : O(N) & S.C. : O(1)
class Solution {
    Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if(head==null) {
            head = temp;
            return head;
        }
        Node ptr = head;
        while(ptr.next!=null) {
            ptr=ptr.next;
        }
        ptr.next=temp;
        return head;
    }
}
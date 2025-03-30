//Day 27 Q2 : https://bit.ly/3QlEoMx
//T.C. : O(N) & S.C. : O(1)
class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) return null;
        Node temp = head;
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        for (int i = 1; temp != null && i < x; i++) {
            temp = temp.next;
        }
        if (temp == null) return head;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        return head;
    }
}
//Day 26 Q2 : https://bit.ly/3Epriup
//T.C. : O(N) & S.C. : O(1)
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        while(temp!=null) {
            if(key==temp.data) return true;
            temp = temp.next;
        }
        return false;
    }
}
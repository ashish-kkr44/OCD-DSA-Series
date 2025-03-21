//Day 17 q2
//T.C. : O(N) & S.C. : O(1)
//Q2 : https://leetcode.com/problems/remove-outermost-parentheses/description/
class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()) {
            if(s.charAt(i)=='(') {
                cnt++;
                if(cnt>1) sb.append('(');
                i++;
            } else {
                cnt--;
                if(cnt>0) sb.append(')');
                i++;
            }
        }
        return sb.toString();
    }
}
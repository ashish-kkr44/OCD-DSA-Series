//Question link :- https://leetcode.com/problems/binary-search/description/
// Approach :- Simply Binary Search approach.
//T.C. = O(N) & S.C. = O(1)
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int n = low + (high - low) / 2;
            if (nums[n] == target) return n;
            else if (nums[n] < target) low = n + 1;
            else high = n - 1;
        }
        return -1;
    }
}
// Question link : https://leetcode.com/problems/search-insert-position/description/
//T.C. : O(log N) & S.C. : O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int n=0;
        while(low<=high) {
            n=(low+high)/2;
            if(nums[n]==target) return n;
            else if(nums[n]>target) high=n-1;
            else low=n+1;
        }
        return high+1;
    }
}
// Question link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// Approach : Doing binary search for ending and starting positions differently.
//T.C. : O(N) & S.C. : O(1)

//Code :
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0, high=nums.length-1,start_po=-1;
        int[] res = {-1,-1};
        while(low<=high) {
            int n=(low+high)/2;
            if(nums[n]>target) high = n-1;
            else if(nums[n]<target) low = n+1;
            else {
                start_po = n;
                high = n-1;
            }
        } 
        if(start_po==-1) return res;
        low=0;
        high = nums.length-1;
        int end_po = -1;
        while(low<=high) {
            int n=(low+high)/2;
            if(nums[n]>target) high = n-1;
            else if(nums[n]<target) low = n+1;
            else {
                end_po = n;
                low = n+1;
            }
        }
        res[0] = start_po;res[1] = end_po;
        return res;
    }
}
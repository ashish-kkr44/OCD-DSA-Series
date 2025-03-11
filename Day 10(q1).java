//Question link : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
//Leetcode : Rearrange numbers with sign.

// Approach 1 : Stored positive and negative numbers into two different arrays and then print one by one from from both arrays.
// T.C. : O(N) & S.C. : O(N)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length,j=0,k=0;
        int[] p=new int[n/2], s= new int[n/2];
        for(int i=0; i<n; i++) {
            if(nums[i]>0) {
                p[j] = nums[i];
                j++;
            } else if(nums[i]<0) {
                s[k] = nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                nums[i] = p[j];
                j++;
            } else {
                nums[i] = s[k];
                k++;
            }
        }
        return nums;
    }
}

// Approach 2 : Using different indices for both types of numbers and then copying the data from nums array to new array in the required pattern.
//T.C. : O(N) & S.C. : O(N)
class ashish {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pI = 0;
        int nI = 1;
        int[] req = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                req[pI] = nums[i];
                pI += 2;
            } else {
                req[nI] = nums[i];
                nI += 2;
            }
        }
        return req;
    }

}

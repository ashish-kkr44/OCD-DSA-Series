// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x=0, l=flowerbed.length;
        if(n==0) return true;
        if(n<0) return false;
        if(l==1 && flowerbed[0]==0) {
            return true;
        } else if(l==1 && flowerbed[0]==1) {
            return false;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0) {
            x++;
            flowerbed[0] = 1;
        }
        if(flowerbed[l-1]==0 && flowerbed[l-2]==0) {
            x++;
            flowerbed[l-1]=1;
        }
        for(int i=1; i<l-1; i++) {
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0) {
                x++;
                flowerbed[i] = 1;
            }
        }
        if(x>=n) return true;
        else return false;
    }
}
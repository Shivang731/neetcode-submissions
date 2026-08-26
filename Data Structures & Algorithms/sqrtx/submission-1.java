class Solution {
    public int mySqrt(int x) {
        int s=0;
        int l =x;
        int result =0;

        while(s<=l){
            int mid = s+(l-s)/2;

            if((long)mid*mid>x){
                l=mid-1;
                
            }else if(mid*mid<x){
                result = mid;
                s=mid+1;

            }else {
                return mid;
            }
        } return result;
    }
}
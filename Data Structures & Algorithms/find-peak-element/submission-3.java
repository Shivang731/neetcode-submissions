class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        
        int s=0;
        int l= n-1;

        while(s<l){
            int mid = (s+l)/2;

            if(nums[mid]<nums[mid+1]){
                s= mid+1;
            }else {
                l=mid;
            }
        } return s;
        
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s=0;
        int l = n-1;
       
        
        while(s<=l){
            
        int mid =(s+l)/2;
            if(nums[mid]>target){
                l= mid-1;
            }else if(nums[mid]<target){
                s= mid+1;
            }else{
                return mid;
            }
        } return s;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s=0;
        int l=n-1;

        while(s<=l){
            int mid =s+(l-s)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[mid]>= nums[s]){
                if(nums[mid]>target && target>=nums[s]){
                    l=mid-1;
                }else {
                    s=mid+1;
                
                
                }
                }else {
                    if(nums[mid]<target && nums[l]>=target){
                       s=mid+1;
                    }else {
                        l=mid-1;
                    }
                
            } 
        } return -1;
        
    }
}

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s =0;
        int l= n-1;

        while(s<l){
            int mid = s+(l-s)/2;

            if(mid%2==1){ 
                mid--;
            }

            if( nums[mid]== nums[mid+1]){
                s=mid+2;
            }else {
                l =mid;
            }
        }return nums[s];
        
    }
}
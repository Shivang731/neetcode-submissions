class Solution {
    public int search(int[] nums, int target) {
        int n =  nums.length;
        int l = n-1;
        int s = 0;

        while(s<=l){
            int mid = (s+l)/2;
            if(nums[mid]<target){
                s= mid+1;
            }else if(nums[mid]>target){
                l= mid-1;
            }else {
                return mid;
            }
        }return -1;
    }
}

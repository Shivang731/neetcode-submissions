class Solution {
    public void reverseString(char[] s) {
        int left =0 ;
        int right = s.length -1;

        while(left< right){
            //create a temp variable s
            // store value of left 
            // then enter it to right

            char temp= s[left];
            s[left] = s[right];
             s[right] = temp;

            left++;
            right--;
        }
    }
}
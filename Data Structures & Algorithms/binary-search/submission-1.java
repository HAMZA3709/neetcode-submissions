class Solution {
    public int search(int[] nums, int target) {
         int L=0;
       int R=nums.length-1;
       while(L <= R){
        
        int mid=L+(R-L)/2;
        int val=nums[mid];
        if(target==val)
        return mid;
        else if (target>val)
        L=mid+1;
         else if (target<val)
        R=mid-1;
         
       };
       return -1;
    }
}

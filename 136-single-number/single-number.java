class Solution {
    public int singleNumber(int[] nums) {
       int i=0;
       int count=0;
       while(i<nums.length){
           count=count^nums[i];
           i=i+1;
       }
       return count;
    }
}
class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
           int Alice=nums[i];
           nums[i]=-1;
           int Bob=nums[i+1];
           nums[i]=-1;
           arr[i]=Bob;
           arr[i+1]=Alice;
           i+=2;
        }
        return arr;
    }
}
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        int w=nums[length-1];
        int x=nums[length-2];
        int y=nums[0];
        int z=nums[1];
        int result=(w*x)-(y*z);
        return result;
    }
}
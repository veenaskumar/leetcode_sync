class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        arr[0]=binarysearch(nums,target,true);
        arr[1]=binarysearch(nums,target,false);
        return arr;
    }
    static int binarysearch(int[] nums,int target,boolean firstOrLast){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstOrLast){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
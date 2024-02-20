class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
        int i=0,j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int p=0,q=k-1;
        while(p<q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
            p++;
            q--;
        }
        int x=k,y=nums.length-1;
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;
            y--;
        }
    }
    
}
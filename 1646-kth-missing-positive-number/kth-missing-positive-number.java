class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int ans=0;
        for(int i=1;count!=k;i++){
            if(contains(arr,i)==false){
                count+=1;
                ans=i;
                System.out.println(ans+" "+count);
            }
        }
        return ans!=0?ans:-1;
    }
    static boolean contains(int[] arr,int i){
        for(int ele:arr){
            if(ele==i){
                return true;
            }
            
        }
        return false;
    }
}
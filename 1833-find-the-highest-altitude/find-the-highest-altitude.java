class Solution {
    public int largestAltitude(int[] gain) {
        int[] res=new int[gain.length+1];
        res[0]=0;
        int i=0;
        int j=1;
        while(i!=gain.length){
            res[j]=res[i]+gain[i];
            i++;
            j++;
        }
        int max=res[0];
        for(int k=0;k<res.length;k++){
            if(max<res[k]){
                max=res[k];
            }
        }
        return max;
    }
}
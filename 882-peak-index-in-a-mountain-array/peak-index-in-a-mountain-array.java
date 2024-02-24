class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=i+1;
        while(i<arr.length){
            if(arr[i]>arr[j]){
                return i;
            }
            i++;
            j++;
        }
        return -1;
        
    }
}
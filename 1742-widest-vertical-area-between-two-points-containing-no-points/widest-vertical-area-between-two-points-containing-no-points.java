class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int row=points[0].length;
        int col=points.length;
        int[] arr=new int[col];
        for(int i=0;i<col;i++){
           arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=arr.length-1;i>0;i--){
            if(max<arr[i]-arr[i-1]){
                max=arr[i]-arr[i-1];
            }
        }
        return max ;
    }   
}
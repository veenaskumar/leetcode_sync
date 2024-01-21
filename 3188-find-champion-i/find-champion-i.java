class Solution {
    public int findChampion(int[][] grid) {
        int row=grid[0].length;
        int col=grid.length;
        int[] arr=new int[col];
        for(int i=0;i<col;i++){
            int count=0;
            for(int j=0;j<row;j++){
                if(grid[i][j]==1 && i!=j){
                    count+=1;
                }
            }
            arr[i]=count;
        }
        int max=arr[0];
        int strong=0;
        for(int i=1;i<col;i++){
            if(max<arr[i]){
                strong=i;
                max=arr[i];
            }
        }
        return strong;
    }
}
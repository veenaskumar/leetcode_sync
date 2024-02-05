class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }
        }
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            
             for(int l=0;l<n;l++){
                    arr[row][l]+=1;
                        }                
            
            for(int x=0;x<m;x++){
                arr[x][col]+=1;
            }
        }
        for(int o=0;o<m;o++){
            for(int p=0;p<n;p++){
                if(arr[o][p]%2!=0){
                    count+=1;
                }
            }
        }

        return count;
    }
}
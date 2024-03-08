class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[] result=new int[2];
        for(int i=0;i<row;i++){
            int count_ones=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count_ones+=1;
                }
            }
            if(result[1]<count_ones){
                result[0]=i;
                result[1]=count_ones;
            }
        }
        return result;
    }
}
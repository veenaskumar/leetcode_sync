class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image[0].length;
        int col = image.length;
        int[][] result = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = j + 1; k < row; k++) {
                    int temp = image[i][j];
                    image[i][j] = image[i][k];
                    image[i][k] = temp;
                }
            }
        }
        for(int p=0;p<col;p++){
            for(int q=0;q<row;q++){
                if(image[p][q]==0){
                    image[p][q]=1;
                }
                else{
                    image[p][q]=0;
                }
            }
        }

        return image;
    }
}
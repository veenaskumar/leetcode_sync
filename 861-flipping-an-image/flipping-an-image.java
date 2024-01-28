class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int length=image.length;
        
        for(int i=0;i<length;i++){
            int j=0;
            int k=length-1;
            while(j<k){
                int temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                j++;
                k--;
            }
        }
        for(int x=0;x<length;x++){
            for(int y=0;y<length;y++){
                if(image[x][y]==0){
                    image[x][y]=1;
                }
                else{
                    image[x][y]=0;
                }
            }
        }
        return image;
    }
}
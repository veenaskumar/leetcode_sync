class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        int j=num/2;
        if(num==1) return true;
        while(i<=j){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}
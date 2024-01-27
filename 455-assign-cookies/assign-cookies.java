class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedy_length=g.length;
        int cookie_length=s.length;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<cookie_length;i++){
            for(int j=0;j<greedy_length;j++){
                if(s[i]>=g[j] && g[j]>0){
                    count+=1;
                    g[j]=-1;
                    break;
                }
            }
        }
        return count;
    }
}
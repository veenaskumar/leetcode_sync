class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean x;
        String res="";
        for(int i=0;i<words.size();i++){
            res+=words.get(i).charAt(0);
            System.out.println(res);
        }
        if(res.equals(s)){
            return true;
        }
        return false;
    }
}
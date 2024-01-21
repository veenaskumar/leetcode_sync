class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int length=words.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<length;i++){
            String newstr=words[i];
            for(int j=0;j<newstr.length();j++){
                if(newstr.charAt(j)==x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}
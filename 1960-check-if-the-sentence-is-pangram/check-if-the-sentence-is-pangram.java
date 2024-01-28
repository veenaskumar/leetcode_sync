class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] characters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int str_length=sentence.length();
        int count=0;
        if(str_length<26) return false;
        else{
        for(int i=0;i<sentence.length();i++){
            for(int j=0;j<characters.length;j++){
                if(sentence.charAt(i)==characters[j]){
                    count+=1;
                    characters[j]='0';
                }
            }
        }
        if(count==26){
            return true;
        }
        }
        return false;
    }
}
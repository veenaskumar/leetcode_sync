class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        // char a='a';
        while(i<letters.length){
            if(letters[i]>target){
               return letters[i];
            }
            else{
                i++;
            }
        }
        return letters[0];
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransom=ransomNote.toCharArray();
        char[] magazine_arr=magazine.toCharArray();
        if(ransom.length>magazine_arr.length){
            return false;
        }
        else{
            int count=0;
            for(int i=0;i<magazine_arr.length;i++){
                for(int j=0;j<ransom.length;j++){
                    if(magazine_arr[i]==ransom[j]){
                        count+=1;
                        ransom[j]='0';
                        break;
                    }
                }
            }
            if(count==ransom.length){
                return true;
            }
        }
        return false;
    }
}
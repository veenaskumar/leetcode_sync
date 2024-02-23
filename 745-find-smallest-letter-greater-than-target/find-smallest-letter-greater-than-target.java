class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        while(i<letters.length){
            if(letters[i]>target){
               return letters[i];
            }
            else{
                i++;
            }
        }
        return letters[0];
        // int start=0;
        // int end=letters.length-1;
        // if(letters[end]<=target || target<letters[start]) {
        //     return letters[start];
        // }
        
        // while(start<=end) {
        //     int mid=start+(end-start)/2;
        //     if(letters[mid]<=target) {
        //         start=mid+1;
        //         System.out.println("start--> "+start);
        //     } else {
        //         end=mid-1;
        //         System.out.println("end --> "+end);
                
        //     }
        // }
        // return letters[start];
    }
}
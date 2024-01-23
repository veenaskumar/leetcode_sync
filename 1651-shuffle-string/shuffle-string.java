class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[indices.length];
        String str="";
        for(int i=0;i<s.length();i++){
            int k=indices[i];
            arr[k]=s.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        return str;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],count);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
         while (iterator.hasNext()) {
             Map.Entry<Integer, Integer> entry = iterator.next();
             int value=entry.getValue();
             int key=entry.getKey();
             if(value==0){
                 return key;
                 
             }
         }
         return 0;
    }
}
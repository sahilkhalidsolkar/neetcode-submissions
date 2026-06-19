class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int[] op = new int[2];
        for(int i = 0; i< nums.length; i ++){
           int noToFind =  target - nums[i] ;
           if ( hMap.containsKey(noToFind) ){
            op[1]=i;
            op[0]=hMap.get(noToFind);
           }else{
            hMap.put(nums[i], i);
           }
        }
        return op;
    }
}

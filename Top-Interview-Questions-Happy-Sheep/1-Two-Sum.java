class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> indexofNum = new HashMap();
        for(int i =0; i < nums.length; i++) {
            //cannot be abs because we need to find from target minus current array;
            int diff = target-nums[i];
            if(indexofNum.containsKey(diff)){
                return new int[] {indexofNum.get(diff),i };
            }
            indexofNum.put(nums[i], i);
        }
        
        return null;
    }
}
//9-15 = -6 Caanot have it turn to abs because then what if there's a 6? 6+15 = 21. No
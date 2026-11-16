class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            int word = nums[i];
            j ++;
            for(int k = 0 + j; k < nums.length; k++){
                if (word == nums[k]){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
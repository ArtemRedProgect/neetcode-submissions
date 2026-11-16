class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] targets = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j ++){
                if(i != j && nums[i] + nums[j] == target){
                    targets[0] = i;
                    targets[1] = j;
                    return targets;
                }
            }
        } 
        return new int[0]; 
    }
}

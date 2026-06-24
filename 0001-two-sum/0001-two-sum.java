class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j=0;
        for(i=0; i<nums.length; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if((nums[i]-target)+nums[j]==0)
                {
                    i+=nums.length;
                    break;
                }
            }
        }
        return new int[]{i-nums.length-1,j};
    }
}
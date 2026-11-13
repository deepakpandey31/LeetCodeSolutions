class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int a=0,result=0;
        nums.push_back(0);
        for(int i=0; i<nums.size(); i++)
        {
            if(nums[a]==1 && nums[i]==1)
            {
            }
            else
            {
                if(result<(i-a+1))
                result=i-a+1;
                a=i+1;
            }
        }
        return result-1;
    }
};
class Solution {
public:
    int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int k=n%10;
            sum+=k;
            n/=10;
        }
        return sum;
    }
    int smallestIndex(vector<int>& nums) {
        for(int i=0; i<nums.size(); i++)
        {
            if(i!=sum(nums[i]))
            continue;
            return i;
        }
        return -1;
    }
};
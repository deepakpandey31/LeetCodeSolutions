class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        if (nums.empty())
            return {-1, -1};

        int a = -1, b = -1;

        int s1 = 0, l1 = nums.size() - 1;
        int s2 = 0, l2 = nums.size() - 1;

        // First occurrence search
        while (s1 <= l1) {
            int m1 = s1 + (l1 - s1) / 2;

            if (nums[m1] == target) {
                a = m1;
                l1 = m1 - 1;   // Search further left
            }
            else if (target < nums[m1]) {
                l1 = m1 - 1;
            }
            else {
                s1 = m1 + 1;
            }
        }

        // Last occurrence search
        while (s2 <= l2) {
            int m2 = s2 + (l2 - s2) / 2;

            if (nums[m2] == target) {
                b = m2;
                s2 = m2 + 1;   // Search further right
            }
            else if (target < nums[m2]) {
                l2 = m2 - 1;
            }
            else {
                s2 = m2 + 1;
            }
        }

        return {a, b};
    }
};
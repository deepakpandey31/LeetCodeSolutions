class Solution {
    public int singleNumber(int[] nums) {
        int xorResult = 0;
        
        for (int num : nums) {
            xorResult ^= num; // '^=' is the bitwise XOR assignment operator
        }
        return xorResult;
    }
}

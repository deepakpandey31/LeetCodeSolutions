class Solution {
public:
    int reverseDegree(string s) {
        int sum=0;
        for(int i=0; i<s.length(); i++)
        {
            sum+=(i+1)* (static_cast<int>(s[i])-(71+(2*(static_cast<int>(s[i])-97))));
        }
        return sum;
    }
};
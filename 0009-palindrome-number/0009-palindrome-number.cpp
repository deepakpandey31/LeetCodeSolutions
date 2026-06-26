class Solution {
public:
    bool isPalindrome(int x) {
        long rev=0,y=(long)x;
        if(x<0)
        return false;
            while(y!=0)
            {
                rev=(rev*10)+(y%10);
                y/=10;
            }
            if(rev==x)
            return true;
            else
            return false;
    }
};
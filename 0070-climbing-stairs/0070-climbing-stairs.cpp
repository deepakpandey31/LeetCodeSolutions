class Solution {
public:
    int climbStairs(int n) {
        if (n==1)
            return 1;
        else if(n==2)
            return 2;
        int a=1;
        int b=2;
        int sum=0;
        int i=3;
        while (i<=n)
        {
            sum=a+b;
            a=b;
            b=sum;
            i+=1;
        }
        return sum;
    }
};
class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        while(n!=0)
        {
            int k=n&1;
            if(k==1)
            c++;
            n=n>>1;
            if(c==2)
            break;
        }
        if(c==1)
        return true;
        else
        return false;
    }
}
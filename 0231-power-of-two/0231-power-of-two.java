class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
        return false ;
        if(1073741824%n==0)
        return true;
        return false;

        /* Another solution>>>
        
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
        */
    }
}
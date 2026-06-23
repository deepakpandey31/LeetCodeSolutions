class Solution {
    public int bitwiseComplement(int n) {
        int i=0;
        int m=n;
        while(m!=0)
        {
            m=m>>1;
            i=i<<1;
            i=i|1;
        }
        if(n==0)
        return 1;
        return (~n)&i;
    }
}
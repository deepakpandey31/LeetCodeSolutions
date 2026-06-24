class Solution
{
public
    int reverse(int x)
    {
        int t = 1;
        if (x < 0)
        {
            t = -1;
            x = -(x);
        }
        String n = String.valueOf(x);
        String rev = new StringBuilder(n).reverse().toString();
        String rev2 = new StringBuilder(rev).reverse().toString();
        try
        {
            int k = Integer.parseInt(rev2);
            if (k == x)
                t = Integer.parseInt(rev) * t;
        }
        catch (NumberFormatException e)
        {
            t = 0;
        }
        return t;
    }
}
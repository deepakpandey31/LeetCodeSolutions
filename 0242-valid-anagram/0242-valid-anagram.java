class Solution {
    public boolean isAnagram(String s, String t) {
        String x=""; String y="";
        if(s.length()==t.length())
        {
            for(char ch='a'; ch<='z'; ch++)
            {
                for(int i=0; i<s.length(); i++)
                {
                    if(s.charAt(i)==ch)
                    x+=s.charAt(i);
                    if(t.charAt(i)==ch)
                    y+=t.charAt(i);
                }
            }
        }
        else
        return false;
        return x.equals(y);
    }
}
class Solution {
    public int romanToInt(String s) {
       int sum=0;
       s+=" ";
       for(int i=0; i<s.length()-1; i++)
       {
        if(s.charAt(i)=='I')
        sum+=1;
        if(s.charAt(i)=='V')
        sum+=5;
        if(s.charAt(i)=='X')
        sum+=10;
        if(s.charAt(i)=='L')
        sum+=50;
        if(s.charAt(i)=='C')
        sum+=100;
        if(s.charAt(i)=='D')
        sum+=500;
        if(s.charAt(i)=='M')
        sum+=1000;
        if(s.charAt(i)=='I'&&s.charAt(i+1)=='V')
        {
            sum-=1;
            sum+=4;
            i++;
        }
          if(s.charAt(i)=='I'&&s.charAt(i+1)=='X')
        {
            sum-=1;
            sum+=9;
            i++;
        }
          if(s.charAt(i)=='X'&&s.charAt(i+1)=='L')
        {
            sum-=10;
            sum+=40;
            i++;
        }
          if(s.charAt(i)=='X'&&s.charAt(i+1)=='C')
        {
            sum-=10;
            sum+=90;
            i++;
        }
           if(s.charAt(i)=='C'&&s.charAt(i+1)=='D')
        {
            sum-=100;
            sum+=400;
            i++;
        }
           if(s.charAt(i)=='C'&&s.charAt(i+1)=='M')
        {
            sum-=100;
            sum+=900;
            i++;
        }
       } 
       return sum;
    }
}
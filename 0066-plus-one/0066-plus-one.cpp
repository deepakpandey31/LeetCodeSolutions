class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
         for(  std::reverse_iterator<std::vector<int>::iterator> it= digits.rbegin(); it!=digits.rend(); it++)
        {
            if(*it!=9)
            {
                *it+=1;
                break;
            }
            else
            {
                *it=0;
                if(it+1==digits.rend())
                {
                    digits.insert(digits.begin(),1);
                    break;
                }
            }
        }
  return digits;
    }
};
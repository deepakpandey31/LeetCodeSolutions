class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0,l=arr.length-1,m=s+(l-s)/2,res=0;
        while(s<=l)
        {
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1])
            {
            res=m;
            break;
            }
            else if(arr[m]<arr[m-1])
            l=m;
            else if(arr[m]<arr[m+1])
            s=m+1;
            m=s+(l-s)/2;
        }
        return res;
    }
}
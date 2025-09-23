class Solution {
    public int romanToInt(String s) {
        int size = s.length();
        int[] arr = new int[size];
        int sum=0;
        int id=0;
        for(int i=0;i<size;i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[id++]=1;
            }
            else if(s.charAt(i)=='V')
            {
                arr[id++]=5;
            }
            else if(s.charAt(i)=='X')
            {
                arr[id++]=10;
            }
            else if(s.charAt(i)=='L')
            {
                arr[id++]=50;
            }
            else if(s.charAt(i)=='C')
            {
                arr[id++]=100;
            }
            else if(s.charAt(i)=='D')
            {
                arr[id++]=500;
            }
            else 
            {
                arr[id++]=1000;
            }
        }
        for(int i=size-1;i>0;i--)
        {
            if(arr[i]<=arr[i-1])
            {
                sum = sum+arr[i];
            }
            else 
            {
                sum = sum-arr[i-1];
                arr[i-1]=arr[i];
            }
        }
        return sum+arr[0];

    }
}

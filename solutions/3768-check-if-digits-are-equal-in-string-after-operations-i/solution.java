class Solution {
    public boolean hasSameDigits(String s) {
        
        // while(s.length()>2)
        // {
        //     StringBuilder sb = new StringBuilder();
        //     for(int i=0;i<s.length()-1;i++)
        //     {
        //         sb.append((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10); 
        //     }
        //     s=sb.toString();
        // }
        // if(s.charAt(0)==s.charAt(1))
        // {
        //     return true;
        // }
        // return false;

        int n = s.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.charAt(i)-'a';
        }

        while(n>2)
        {
            for(int i=0;i<n-1;i++)
            {
                arr[i] = (arr[i]+arr[i+1])%10;
            }
            n--;
        }
        return arr[0]==arr[1];
        
    }
}

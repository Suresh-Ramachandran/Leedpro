class Solution {
    public int[] plusOne(int[] digits) {
        int digit = digits.length;
       for(int i=digit-1;i>=0;i--)
       {
            if(digits[i]<9)
            {
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
       }
       int[] arr = new int[digit+1];
       arr[0]=1;
       return arr;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        int sum1 = 0;
        int i=0;
        
        for(int j:nums)
        {
            sum = sum+i;
            sum1 = sum1+j;
            i++;
        }
        return (sum+i)-sum1;
        
    }
}

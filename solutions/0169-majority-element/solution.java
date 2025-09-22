class Solution {
    public int majorityElement(int[] nums) {
        //int size = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums)
        {
           freq.put(num,freq.getOrDefault(num,0)+1); 
        }
        int max=0;
        int num1=0;
        for(int num:nums)
        {
            if(freq.get(num)>max)
            {
                max = freq.get(num);
                num1 = num;
            }
        }
        return num1;
    }
}

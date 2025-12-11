class Solution {

    void swap(int[] nums,int s,int d)
    {
        int i=s;
        int j = d;

        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int d = k%nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,d-1);
        swap(nums,d,nums.length-1);
    }
}

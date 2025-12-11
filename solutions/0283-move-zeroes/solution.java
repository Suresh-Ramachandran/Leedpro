class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0)
        //     {
        //         for(int j=i+1;j<nums.length;j++)
        //         {
        //             if(nums[j] !=0)
        //             {
        //                 int temp = nums[i];
        //                 nums[i] = nums[j];
        //                 nums[j]=temp;
        //                 break;
        //             }
        //         }
        //     }
        // }

        int pos = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] !=0)
            {
                nums[pos] = nums[i];
                pos++;
            }
        }

        for(int i = pos ;i<nums.length;i++)
        {
            nums[i]=0;
        }

        
        
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1.length>nums2.length)
        {
            intersection(nums2,nums1);
        }
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int i:nums2)
        {
            if(set.contains(i)) set2.add(i);
        }
        int[] arr = new int[set2.size()];
        int k =0;
        for(int i:set2)
        {
            arr[k++] = i;
        }
        return arr;
    }
}

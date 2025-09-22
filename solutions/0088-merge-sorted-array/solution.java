class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int k:nums2)
        {
            nums1[m++]=k;
        }
        Arrays.sort(nums1);
    }
}

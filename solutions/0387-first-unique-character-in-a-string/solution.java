class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int k=0;
        for(char i:s.toCharArray())
        {
            arr[i-'a']++;
        }
        for(char i:s.toCharArray())
        {
            if(arr[i-'a']==1)
            {
                return k;
            }
            k++;
        }
        return -1;
    }
}

class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        int maxodd=0;
        int maxeven =s.length();
        for(char i : s.toCharArray())
        {
            arr[i-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0 && arr[i]%2==0){
                maxeven = Math.min(arr[i],maxeven);
            }
            if(arr[i]>0 && arr[i]%2!=0){
                maxodd = Math.max(arr[i],maxodd);
            }

        }
        return maxodd-maxeven;
    }
}

class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int temp =n;
        while(temp-- >0)
        {
            sb.append("a");
        }
        int i=n-1;
        k -=n;
        while(k>0)
        {
            int add = Math.min(25,k);
            char ch = (char)('a'+add);
            sb.setCharAt(i,ch);
            k -= add;
            i--;
        }
        return sb.toString();
    }
}

class Solution {
    public int titleToNumber(String columnTitle) {
       int result =0;
        for(char i :columnTitle.toCharArray())
        {
            result = result*26 + (i-'A'+1);
        }
        return result;
    }
}
